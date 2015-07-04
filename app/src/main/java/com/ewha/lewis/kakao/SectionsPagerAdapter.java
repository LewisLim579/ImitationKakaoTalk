package com.ewha.lewis.kakao;

import com.astuetz.PagerSlidingTabStrip.IconTabProvider;

import java.util.List;

public class SectionsPagerAdapter extends android.support.v4.app.FragmentPagerAdapter implements IconTabProvider {
	
	private List<BaseFragment> mFragments;
	
	public SectionsPagerAdapter(android.support.v4.app.FragmentManager fm, List<BaseFragment> fragments) {
		super(fm);
		mFragments = fragments;
	}

	@Override
	public BaseFragment getItem(int position) {
		return mFragments.get(position);
	}

	@Override
	public int getCount() {
		return mFragments.size();
	}

	@Override
	public CharSequence getPageTitle(int position) {
		return mFragments.get(position).getTitle();
	}

	@Override
	public int getPageIconResId(int position) {
		return mFragments.get(position).getDefaultIcon();
	}

	@Override
	public int getPageActivatedResId(int position) {
		return mFragments.get(position).getActivatedIcon();
	}
}
