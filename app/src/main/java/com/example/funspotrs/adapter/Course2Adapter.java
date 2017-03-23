package com.example.funspotrs.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.funspotrs.R;
import com.example.funspotrs.course.Courses2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 天空 on 2017/3/23 0023.
 */

public class Course2Adapter extends BaseAdapter {
    private List<Courses2> list = new ArrayList<Courses2>();
    private Context context;
    private LayoutInflater inflater;

    public Course2Adapter(Context context, List<Courses2> list) {
        super();
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            holder = new ViewHolder();
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_item_course, null);
            holder.headIcon1 = (ImageView) convertView.findViewById(R.id.stu_image);
            holder.headIcon2 = (ImageView) convertView.findViewById(R.id.im_cr);
            holder.text1 = (TextView) convertView.findViewById(R.id.tv_acount_1);
            holder.text2 = (TextView) convertView.findViewById(R.id.tv_acount_2);
            holder.text3 = (TextView) convertView.findViewById(R.id.tv_acount_3);
            holder.text4 = (TextView) convertView.findViewById(R.id.tv_acount_4);
            holder.text5 = (TextView) convertView.findViewById(R.id.tv_acount_5);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
            holder.headIcon1.setImageResource(list.get(position).getImageid());
            holder.headIcon2.setImageResource(list.get(position).getImageid2());
            holder.text1.setText(list.get(position).getType1());
            holder.text2.setText(list.get(position).getType2());
            holder.text3.setText(list.get(position).getN1());
            holder.text5.setText(list.get(position).getN2());
        }

        return convertView;
    }

    class ViewHolder {
        ImageView headIcon1;
        ImageView headIcon2;
        TextView text1;
        TextView text2;
        TextView text3;
        TextView text4;
        TextView text5;

    }
}
