package com.example.funspotrs.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.funspotrs.R;

/**
 * Created by 天空 on 2017/3/21 0021.
 */

public class CourseAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
if (convertView==null){
    convertView = inflater.inflate(R.layout.list_item, null);
}
        return convertView;
    }
}
