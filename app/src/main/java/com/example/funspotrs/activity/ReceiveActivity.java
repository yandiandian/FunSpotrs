package com.example.funspotrs.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.example.funspotrs.R;
import com.example.funspotrs.common.ActivityUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ReceiveActivity extends AppCompatActivity {

    @BindView(R.id.btn_sure)
    Button btnSure;
private ActivityUtils activityUtils;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive);
        ButterKnife.bind(this);
        activityUtils=new ActivityUtils(this);
    }

    @OnClick(R.id.btn_sure)
    public void onClick() {
        activityUtils.startActivity(ResumeLoadActivity.class);
    }
}
