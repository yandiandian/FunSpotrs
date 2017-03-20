package com.example.funspotrs.user.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.funspotrs.R;
import com.example.funspotrs.common.ActivityUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.et_Password)
    EditText etPassword;
    @BindView(R.id.et_Confirm)
    EditText etConfirm;
    @BindView(R.id.btn_login)
    Button btnRegister;
    @BindView(R.id.tv_word)
    TextView tvWord;
    @BindView(R.id.iv_line)
    ImageView ivLine;
    private ActivityUtils activityUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        activityUtils = new ActivityUtils(this);
    }

    @OnClick({R.id.btn_login, R.id.tv_word})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_Register:
                break;
            case R.id.tv_word:
                break;
        }
    }
}
