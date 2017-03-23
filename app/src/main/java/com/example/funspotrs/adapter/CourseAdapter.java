package com.example.funspotrs.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.funspotrs.R;
import com.example.funspotrs.course.Courses;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 天空 on 2017/3/21 0021.
 */

public class CourseAdapter extends BaseAdapter {
    private List<Courses> list = new ArrayList<Courses>();
    protected LayoutInflater inflater;
    private Context context;

    public CourseAdapter(Context context, List<Courses> list) {
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
            convertView = inflater.inflate(R.layout.list_item, null);
            holder.headIcon= (ImageView) convertView.findViewById(R.id.stu_image);
            holder.Text_a = (TextView) convertView.findViewById(R.id.tv_acount_1);
            holder.Text_b = (TextView) convertView.findViewById(R.id.tv_acount_2);
            holder.Text_c = (TextView) convertView.findViewById(R.id.tv_acount_3);
            holder.Text_d = (TextView) convertView.findViewById(R.id.tv_acount_4);
            holder.Text_e = (TextView) convertView.findViewById(R.id.tv_acount_5);
            holder.Text_f = (TextView) convertView.findViewById(R.id.tv_acount_6);
            holder.Text_g = (TextView) convertView.findViewById(R.id.tv_acount_7);
            holder.Text_h = (TextView) convertView.findViewById(R.id.tv_acount_8);
            holder.Text_j = (TextView) convertView.findViewById(R.id.tv_acount_10);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();

        }
        holder.headIcon.setImageResource(list.get(position).getImageid());
        holder.Text_a.setText(list.get(position).getName());
        holder.Text_b.setText(list.get(position).getType1());
        holder.Text_c.setText(list.get(position).getType2());
        holder.Text_d.setText(list.get(position).getType3());
        holder.Text_e.setText(list.get(position).getData());
        holder.Text_f.setText(list.get(position).getTm());
        holder.Text_g.setText(list.get(position).getLa());
        holder.Text_h.setText(list.get(position).getN1()+"");
        holder.Text_j.setText(list.get(position).getN2()+"");
        return convertView;
    }

    class ViewHolder {
        ImageView headIcon;
        TextView Text_a;
        TextView Text_b;
        TextView Text_c;
        TextView Text_d;
        TextView Text_e;
        TextView Text_f;
        TextView Text_g;
        TextView Text_h;
        TextView Text_j;
    }
}
