package com.ewha.lewis.kakao.tab3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ewha.lewis.kakao.BaseFragment;
import com.ewha.lewis.kakao.R;


public class Tab3FindFriendFragment extends BaseFragment {

	public static Tab3FindFriendFragment newInstance(String title, int activatedIcon, int defaultIcon) {

		Tab3FindFriendFragment newFragment = new Tab3FindFriendFragment();
		newFragment.setTitle(title);
		newFragment.setActivatedIcon(activatedIcon);
		newFragment.setDefaultIcon(defaultIcon);

		return newFragment;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_tab3_find_friend, container, false);

		TextView tvNumber = (TextView) view.findViewById(R.id.tvNumber);
		tvNumber.setText(getTitle());

		return view;
	}

}
