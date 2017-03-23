package com.example.funspotrs.course;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.funspotrs.R;
import com.example.funspotrs.adapter.CourseAdapter;
import com.example.funspotrs.common.ActivityUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class CourseFragment extends Fragment {
    @BindView(R.id.list_view)
    ListView listView;
    private List<Courses> list = new ArrayList<Courses>();
    private CourseAdapter adapter;
    int imgs[] = {R.drawable.im, R.drawable.ich, R.drawable.im};
    private ActivityUtils activityUtils;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_course, container, false);
        ButterKnife.bind(this, view);
        getData();
        adapter = new CourseAdapter(getContext(), list);
        listView.setAdapter(adapter);
        activityUtils = new ActivityUtils(this);
        return view;
    }

    public void getData() {
        for (int i = 0; i < imgs.length; i++) {
            Courses c = new Courses();
            c.setImageid(imgs[i]);
            c.setName("战斗有氧运动");
            c.setType1("塑性 减脂 增肌");
            c.setData("今天 12:10-12:30");
            c.setLa("一号场地");
            c.setN1(1);
            c.setN2(12);
            list.add(c);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    activityUtils.startActivity(CourseActivity.class);
                }
            });
        }
    }


}
