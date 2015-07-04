package com.ewha.lewis.kakao.tab4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ewha.lewis.kakao.BaseFragment;
import com.ewha.lewis.kakao.R;


public class Tab4MoreFragment extends BaseFragment {

	public static Tab4MoreFragment newInstance(String title, int activatedIcon, int defaultIcon) {

		Tab4MoreFragment newFragment = new Tab4MoreFragment();
		newFragment.setTitle(title);
		newFragment.setActivatedIcon(activatedIcon);
		newFragment.setDefaultIcon(defaultIcon);

		return newFragment;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_tab4_more, container, false);

		TextView tvNumber = (TextView) view.findViewById(R.id.tvNumber);
		tvNumber.setText(getTitle());

		return view;
	}
}
