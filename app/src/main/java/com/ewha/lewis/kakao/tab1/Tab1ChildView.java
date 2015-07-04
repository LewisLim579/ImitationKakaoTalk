package com.ewha.lewis.kakao.tab1;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.ewha.lewis.kakao.R;
import com.nostra13.universalimageloader.core.ImageLoader;


public class Tab1ChildView extends FrameLayout {
	ImageLoader mLoader;
	ImageView img_profile;
	TextView tv_name;
	TextView tv_profile;
	Tab1ChildItem mItem;
	public Tab1ChildView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		init();
	}

	public Tab1ChildView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		init();
	}
	
	private void init(){
		LayoutInflater.from(getContext()).inflate(R.layout.tab1_item, this);
		mLoader = ImageLoader.getInstance();
		img_profile=(ImageView)findViewById(R.id.img_profile);
		tv_name=(TextView)findViewById(R.id.textView_name);
		tv_profile=(TextView)findViewById(R.id.textView_info);

	}
	
	public void setData(Tab1ChildItem item){
		mItem=item;

		tv_name.setText(item.name);
		tv_profile.setText(item.profiletext);
		mLoader.displayImage(item.imgURL,img_profile);
	}

}
