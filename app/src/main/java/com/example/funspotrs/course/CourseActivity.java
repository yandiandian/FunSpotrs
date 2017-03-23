package com.example.funspotrs.course;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ListView;

import com.example.funspotrs.R;
import com.example.funspotrs.adapter.Course2Adapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CourseActivity extends Activity {

    @BindView(R.id.cr_lv)
    ListView crLv;
    private List<Courses2> list = new ArrayList<Courses2>();
    private Course2Adapter course2Adapter;
    int imgs[] = {R.drawable.im, R.drawable.ich};
    int ims[]={R.drawable.im, R.drawable.ich};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        setContentView(R.layout.activity_course);
        ButterKnife.bind(this);
        getData();
        course2Adapter = new Course2Adapter(this, list);
        crLv.setAdapter(course2Adapter);

    }

    public void getData() {
        for (int i=0 ;i<imgs.length;i++) {
            Courses2 cs=new Courses2();
            cs.setImageid(imgs[i]);
            cs.setType1("审阅人");
            cs.setType2("目标：减肥 塑性");
            cs.setN1(6);
            cs.setN2(12);
            list.add(cs);
        }
    }
}
