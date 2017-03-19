package com.example.funspotrs.user.register;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.funspotrs.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegisterActivity extends AppCompatActivity {

    @BindView(R.id.et_Password)
    EditText etPassword;
    @BindView(R.id.et_Confirm)
    EditText etConfirm;
    @BindView(R.id.btn_Register)
    Button btnRegister;
    @BindView(R.id.tv_word)
    TextView tvWord;
    @BindView(R.id.iv_line)
    ImageView ivLine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_Register, R.id.tv_word})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_Register:
                break;
            case R.id.tv_word:
                break;
        }
    }
}
