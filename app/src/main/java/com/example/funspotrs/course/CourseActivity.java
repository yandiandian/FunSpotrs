package com.example.funspotrs.course;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;

import com.example.funspotrs.R;

public class CourseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        setContentView(R.layout.activity_course);
    }
}