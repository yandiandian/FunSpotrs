package com.example.funspotrs.me;


import android.accounts.AccountAuthenticatorActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.funspotrs.R;
import com.example.funspotrs.activity.AnthropometricDataActivity;
import com.example.funspotrs.activity.PersonalDataActivity;
import com.example.funspotrs.common.ActivityUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class MeFragment extends Fragment {


    @BindView(R.id.acty_tv_title)
    TextView actyTvTitle;
    @BindView(R.id.main_toobar)
    Toolbar mainToobar;
    @BindView(R.id.iv_user_head)
    ImageView ivUserHead;
    @BindView(R.id.tv_username)
    TextView tvUsername;
    @BindView(R.id.tv_person_info)
    TextView tvPersonInfo;
    @BindView(R.id.tv_person_goods)
    TextView tvPersonGoods;
    private ActivityUtils activityUtils;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_me, container, false);
        ButterKnife.bind(this, view);
        activityUtils = new ActivityUtils(this);
        return view;
    }

    @OnClick({R.id.iv_user_head, R.id.tv_person_goods})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_user_head:
                activityUtils.startActivity(PersonalDataActivity.class);
                break;
            case R.id.tv_person_goods:
                activityUtils.startActivity(AnthropometricDataActivity.class);
                break;
        }
    }
}
