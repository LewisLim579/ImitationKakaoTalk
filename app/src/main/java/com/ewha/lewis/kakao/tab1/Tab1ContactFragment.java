package com.ewha.lewis.kakao.tab1;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;

import com.ewha.lewis.kakao.BaseFragment;
import com.ewha.lewis.kakao.MyUserData;
import com.ewha.lewis.kakao.R;
import com.ewha.lewis.kakao.SoundSearcher;

import java.util.ArrayList;


public class Tab1ContactFragment extends BaseFragment {
    ExpandableListView exView;
    Tab1GroupAdapter myAdapter;
    Tab1SearchHeaderView searchHeaderView;
    ArrayList<Tab1ChildItem> searchResuldList = new ArrayList<>();

    public static Tab1ContactFragment newInstance(String title, int activatedIcon, int defaultIcon) {

        Tab1ContactFragment newFragment = new Tab1ContactFragment();
        newFragment.setTitle(title);
        newFragment.setActivatedIcon(activatedIcon);
        newFragment.setDefaultIcon(defaultIcon);

        return newFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab1_contact, container, false);
        exView = (ExpandableListView) view
                .findViewById(R.id.expandableListView1);
        searchHeaderView = new Tab1SearchHeaderView(getActivity());
        searchHeaderView.getEt().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String text = s.toString();
                if (s.length() == 0) {
                    MyUserData.getInstance().initData();
                    initData();
                    myAdapter.notifyDataSetChanged();
                } else {

                    searchResuldList.clear();
                   // myAdapter = new Tab1GroupAdapter(getActivity());
                    myAdapter.clear();
                    myAdapter.putGroup("검색 결과");
                    //exView.setAdapter(myAdapter);

                    for (int i = 0; i < MyUserData.getInstance().friends.size(); i++) {
                        Tab1ChildItem data = MyUserData.getInstance().friends.get(i);
                        String searchData = data.name.toString();

                        boolean matchData = SoundSearcher.matchString(searchData, text);
                        if (matchData) {
                            searchResuldList.add(data);
                            myAdapter.put("검색 결과", data);
                            myAdapter.notifyDataSetChanged();
                            expandGroup();
                        }
                    }
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });



        exView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                ExpandableListView listView = (ExpandableListView) parent;
                long pos = listView.getExpandableListPosition(position);

                // get type and correct positions
                int itemType = ExpandableListView.getPackedPositionType(pos);
                int groupPos = ExpandableListView.getPackedPositionGroup(pos);
                int childPos = ExpandableListView.getPackedPositionChild(pos);

                if (groupPos == 2) {
                    if (itemType == ExpandableListView.PACKED_POSITION_TYPE_CHILD) {
                        Tab1ChildItem data = (Tab1ChildItem) myAdapter.getChild(groupPos, childPos);
                        MyUserData.getInstance().favolriteFriends.add(data);
                        myAdapter.put("즐겨찾기", data);
                        return false;
                    }
                }
                return false;
            }
        });

        exView.addHeaderView(searchHeaderView);
        initData();


        return view;
    }

    private void expandGroup() {

        exView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
                // TODO Auto-generated method stub
                exView.expandGroup(groupPosition);
            }
        });
        for (int i = 0; i < myAdapter.getGroupCount(); i++) {
            exView.expandGroup(i);
        }
    }

    private void initData() {
        myAdapter = new Tab1GroupAdapter(getActivity());
        exView.setAdapter(myAdapter);


        myAdapter.putGroup("내 프로필");
        myAdapter.putGroup("즐겨찾기");
        myAdapter.putGroup("친구");
        myAdapter.put("내 프로필", MyUserData.getInstance().myData);


        for (int i = 0; i < MyUserData.getInstance().friends.size(); i++) {
            myAdapter.put("친구", MyUserData.getInstance().friends.get(i));
        }

        expandGroup();

    }

}
