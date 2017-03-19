package com.example.funspotrs.me;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.funspotrs.R;
import com.example.funspotrs.common.ActivityUtils;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class MeFragment extends Fragment {

    private View view;
    private ActivityUtils activityUtils;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null){
            view = inflater.inflate(R.layout.fragment_me,container,false);
            ButterKnife.bind(this,view);
            activityUtils = new ActivityUtils(this);
        }
        return view;
    }

    @OnClick({R.id.iv_user_head,R.id.tv_person_info, R.id.tv_login})
    public void onClick(View view) {

    }

}
