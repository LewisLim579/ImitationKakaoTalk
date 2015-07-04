package com.ewha.lewis.kakao.tab2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ewha.lewis.kakao.BaseFragment;
import com.ewha.lewis.kakao.R;


public class Tab2ChatFragment extends BaseFragment {

	public static Tab2ChatFragment newInstance(String title, int activatedIcon, int defaultIcon) {

		Tab2ChatFragment newFragment = new Tab2ChatFragment();
		newFragment.setTitle(title);
		newFragment.setActivatedIcon(activatedIcon);
		newFragment.setDefaultIcon(defaultIcon);

		return newFragment;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_tab2_chat, container, false);

		TextView tvNumber = (TextView) view.findViewById(R.id.tvNumber);
		tvNumber.setText(getTitle());

		return view;
	}


}
