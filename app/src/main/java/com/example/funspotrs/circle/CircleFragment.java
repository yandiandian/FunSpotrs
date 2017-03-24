package com.example.funspotrs.circle;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.example.funspotrs.R;
import com.example.funspotrs.activity.PublishActivity;
import com.example.funspotrs.common.ActivityUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class CircleFragment extends Fragment {


    @BindView(R.id.acty_tv_title1)
    TextView actyTvTitle1;
    @BindView(R.id.acty_tv_title2)
    TextView actyTvTitle2;
    @BindView(R.id.main_toobar)
    Toolbar mainToobar;
    @BindView(R.id.lv_circle)
    ListView lvCircle;
    private ActivityUtils activityUtils;

    public CircleFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_circle, container, false);
        ButterKnife.bind(this, view);
        activityUtils = new ActivityUtils(this);
        return view;
    }

    @OnClick(R.id.acty_tv_title2)
    public void onClick() {
        activityUtils.startActivity(PublishActivity.class);
    }
}
