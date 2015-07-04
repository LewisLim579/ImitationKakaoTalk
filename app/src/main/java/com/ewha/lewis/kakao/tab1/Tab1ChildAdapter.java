package com.ewha.lewis.kakao.tab1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class Tab1ChildAdapter extends BaseAdapter{

	ArrayList<Tab1ChildItem> items= new ArrayList<Tab1ChildItem>();
	Context mContext;
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return items.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return items.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		Tab1ChildView v;
		if(convertView==null){
			v= new Tab1ChildView(mContext);
		}
		else
			v=(Tab1ChildView)convertView;
		v.setData(items.get(position));
		return v;
	}

	public void add(Tab1ChildItem item){
		items.add(item);
		notifyDataSetChanged();
	}
	public Tab1ChildAdapter(Context context) {
		mContext=context;
		// TODO Auto-generated constructor stub
	}

}
