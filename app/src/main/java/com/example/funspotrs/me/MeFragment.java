package com.example.funspotrs.me;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.funspotrs.R;
import com.example.funspotrs.common.ActivityUtils;
import com.pkmmte.view.CircularImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class MeFragment extends Fragment {

    @BindView(R.id.iv_user_head)
    CircularImageView ivUserHead;
    @BindView(R.id.tv_username)
    TextView tvUsername;
    @BindView(R.id.tv_invitenb)
    TextView tvInvitenb;
    @BindView(R.id.tv_person_info)
    TextView tvPersonInfo;
    @BindView(R.id.tv_person_goods)
    TextView tvPersonGoods;
    private View view;
    private ActivityUtils activityUtils;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.fragment_me, container, false);
            ButterKnife.bind(this, view);
            activityUtils = new ActivityUtils(this);
        }
        ButterKnife.bind(this, view);
        return view;
    }


    @OnClick({R.id.iv_user_head, R.id.tv_username, R.id.tv_invitenb, R.id.tv_person_info, R.id.tv_person_goods})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_user_head:
                break;
            case R.id.tv_username:
                break;
            case R.id.tv_invitenb:
                break;
            case R.id.tv_person_info:
                break;
            case R.id.tv_person_goods:
                break;
        }
    }
}
