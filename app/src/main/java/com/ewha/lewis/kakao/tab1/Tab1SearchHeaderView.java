package com.ewha.lewis.kakao.tab1;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.ewha.lewis.kakao.R;


public class Tab1SearchHeaderView extends FrameLayout {

	EditText etSearch;
	ImageView img;
	public Tab1SearchHeaderView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		init();

	}
	
	private void init(){
		LayoutInflater.from(getContext()).inflate(R.layout.tab1_headerview, this);
		etSearch=(EditText)findViewById(R.id.tab1_edittext_search);
		img=(ImageView)findViewById(R.id.tab1_imgsearch);
	}

	public EditText getEt() {
		return etSearch;
	}
}
