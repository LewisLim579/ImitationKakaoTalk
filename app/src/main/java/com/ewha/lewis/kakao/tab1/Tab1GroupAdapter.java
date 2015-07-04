package com.ewha.lewis.kakao.tab1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;

import com.ewha.lewis.kakao.R;

import java.util.ArrayList;

public class Tab1GroupAdapter extends BaseExpandableListAdapter {

    ArrayList<Tab1GroupItem> items = new ArrayList<Tab1GroupItem>();

    Context mContext;

    public Tab1GroupAdapter(Context context) {
        super();
        // TODO Auto-generated constructor stub
        mContext = context;
    }

    public void clear(){
        items.clear();
        notifyDataSetChanged();
    }

    @Override
    public int getGroupCount() {
        // TODO Auto-generated method stub
        return items.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        // TODO Auto-generated method stub
        return items.get(groupPosition).childrens.size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        // TODO Auto-generated method stub
        return items.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        // TODO Auto-generated method stub
        return items.get(groupPosition).childrens.get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return (long) groupPosition << 32 | 0xFFFFFFFF;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return (long) groupPosition << 32 | childPosition;
    }

    @Override
    public boolean hasStableIds() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Tab1GroupView view;
        if (convertView == null) {
            view = new Tab1GroupView(mContext);
        } else
            view = (Tab1GroupView) convertView;
        view.setTextHeader(items.get(groupPosition).key);
        return view;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Tab1ChildView view;
        if (convertView == null) {
            view = new Tab1ChildView(mContext);
        } else
            view = (Tab1ChildView) convertView;

        view.setData(items.get(groupPosition).childrens.get(childPosition));

        return view;
    }


    public void putGroup(String key) {
        Tab1GroupItem group = null;
        int index = -1;
        for (int i = 0; i < items.size(); i++) {
            Tab1GroupItem item = items.get(i);
            int c = item.key.compareTo(key);
            if (c == 0) {
                group = item;
                break;
            } else if (c > 0) {
                index = i;
                break;
            }

        }
        if (group == null) {
            group = new Tab1GroupItem();
            group.key = key;
            if (index == -1) {
                items.add(group);
            } else {
                items.add(index, group);
            }
        }
        notifyDataSetChanged();
    }


    public void put(String key, Tab1ChildItem friendData) {
        Tab1GroupItem group = null;
        int index = -1;
        for (int i = 0; i < items.size(); i++) {
            Tab1GroupItem item = items.get(i);
            int c = item.key.compareTo(key);
            if (c == 0) {
                group = item;
                break;
            } else if (c > 0) {
                index = i;
                break;
            }

        }
        if (group == null) {
            group = new Tab1GroupItem();
            group.key = key;
            if (index == -1) {
                items.add(group);
            } else {
                items.add(index, group);
            }
        }

        if (key != null) {
            Tab1ChildItem child = new Tab1ChildItem();
            child=friendData;
            group.childrens.add(child);
        }


        notifyDataSetChanged();
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        // TODO Auto-generated method stub
        return true;
    }

}
