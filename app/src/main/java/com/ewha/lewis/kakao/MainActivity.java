package com.ewha.lewis.kakao;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.astuetz.PagerSlidingTabStrip;
import com.ewha.lewis.kakao.tab1.Tab1ChildItem;
import com.ewha.lewis.kakao.tab1.Tab1ContactFragment;
import com.ewha.lewis.kakao.tab2.Tab2ChatFragment;
import com.ewha.lewis.kakao.tab3.Tab3FindFriendFragment;
import com.ewha.lewis.kakao.tab4.Tab4MoreFragment;
import com.skt.baas.api.Baas;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;
    private PagerSlidingTabStrip mIndicator;
    private List<BaseFragment> mFragments;
    private TextView tvTitle;
    private TextView tvFriendsCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyUserData.getInstance().initData();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        initialFragment();

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager(),
                mFragments);

        tvTitle = (TextView) findViewById(R.id.tvTitle);
        tvFriendsCount = (TextView) findViewById(R.id.tvFriendCount);




        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        mIndicator = (PagerSlidingTabStrip) findViewById(R.id.indicator);
        mIndicator.setSmoothScrollingEnabled(true);
        mIndicator.setShouldExpand(true);

        mIndicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                for (int i = 0; i < mSectionsPagerAdapter.getCount(); i++) {
                    mIndicator.getIconTab(i).setImageResource(mSectionsPagerAdapter.getPageIconResId(i));
                }

                mIndicator.getIconTab(position).setImageResource(mSectionsPagerAdapter.getPageActivatedResId(position));

                BaseFragment selectedFragment = (BaseFragment) mSectionsPagerAdapter.getItem(position);

                if (selectedFragment.getActionBarTitle() != null)
                    tvTitle.setText(selectedFragment.getActionBarTitle());
                else
                    tvTitle.setText(selectedFragment.getTitle());


                if (position == 0) {
                    tvFriendsCount.setVisibility(View.VISIBLE);
                } else {
                    tvFriendsCount.setVisibility(View.INVISIBLE);
                }

            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {

            }

            @Override
            public void onPageScrollStateChanged(int arg0) {

            }
        });

        mIndicator.setViewPager(mViewPager);


        tvTitle.setText(mSectionsPagerAdapter.getPageTitle(0));
        mIndicator.getIconTab(0).setImageResource(mSectionsPagerAdapter.getPageActivatedResId(0));

    }


    private void initialFragment() {
        mFragments = new ArrayList<BaseFragment>();
        mFragments.add(Tab1ContactFragment.newInstance("친구",
                R.drawable.tab_friend_icon_p,
                R.drawable.tab_friend_icon_n));
        mFragments.add(Tab2ChatFragment.newInstance("채팅",
                R.drawable.tab_chatting_icon_p,
                R.drawable.tab_chatting_icon_n));
        mFragments.add(Tab3FindFriendFragment.newInstance("친구찾기",
                R.drawable.tab_recommend_icon_p,
                R.drawable.tab_recommend_icon_n));
        mFragments.add(Tab4MoreFragment.newInstance("더보기",
                R.drawable.tab_more_icon_p,
                R.drawable.tab_more_icon_n));
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        tvFriendsCount.setVisibility(View.VISIBLE);
        tvFriendsCount.setText(MyUserData.getInstance().friends.size() + "");
    }

    public BaseFragment getFragment(int index) {
        BaseFragment newFragment = null;
        newFragment = (BaseFragment) mSectionsPagerAdapter.getItem(index);

        return newFragment;
    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}
