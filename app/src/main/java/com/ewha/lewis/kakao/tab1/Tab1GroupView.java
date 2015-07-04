package com.ewha.lewis.kakao.tab1;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.ewha.lewis.kakao.R;


public class Tab1GroupView  extends FrameLayout{

	TextView headertv;
	public Tab1GroupView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		init();
	}
	
	private void init(){
		LayoutInflater.from(getContext()).inflate(R.layout.tab1_group_item, this);
		headertv=(TextView)findViewById(R.id.headertv);
	}
	
	public void setTextHeader(String text){
		headertv.setText(text);
	}

}
