package com.example.funspotrs.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import com.example.funspotrs.R;
import com.example.funspotrs.common.ActivityUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ForgetPasswordActivity extends Activity {

    @BindView(R.id.btn_sure)
    Button btnSure;
private ActivityUtils activityUtils;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);
        ButterKnife.bind(this);
        activityUtils=new ActivityUtils(this);
    }

    @OnClick(R.id.btn_sure)
    public void onClick() {
        activityUtils.startActivity(ReceiveActivity.class);
    }
}
