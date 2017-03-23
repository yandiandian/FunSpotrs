package com.example.funspotrs.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;

import com.example.funspotrs.R;

public class PersonalDataActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        setContentView(R.layout.activity_personal_data);
    }
}
