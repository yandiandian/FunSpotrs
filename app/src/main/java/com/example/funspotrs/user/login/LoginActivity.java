package com.example.funspotrs.user.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.funspotrs.R;
import com.example.funspotrs.activity.ForgetPasswordActivity;
import com.example.funspotrs.activity.MainActivity;
import com.example.funspotrs.activity.ResumeLoadActivity;
import com.example.funspotrs.common.ActivityUtils;
import com.example.funspotrs.user.register.RegisterActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.et_Password)
    EditText etPassword;
    @BindView(R.id.et_Confirm)
    EditText etConfirm;
    @BindView(R.id.btn_login)
    Button btnLogin;
    @BindView(R.id.tv_word1)
    TextView tvWord1;
    @BindView(R.id.tv_word2)
    TextView tvWord2;
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

    @OnClick({R.id.btn_login, R.id.tv_word1, R.id.tv_word2})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_login:
                activityUtils.startActivity(MainActivity.class);
                break;
            case R.id.tv_word1:
                activityUtils.startActivity(ForgetPasswordActivity.class);
                break;
            case R.id.tv_word2:
                activityUtils.startActivity(RegisterActivity.class);
                break;
        }
    }
}
