package com.example.funspotrs.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.funspotrs.R;
import com.example.funspotrs.circle.CircleFragment;
import com.example.funspotrs.common.ActivityUtils;
import com.example.funspotrs.course.CourseFragment;
import com.example.funspotrs.me.MeFragment;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.main_toobar)
    Toolbar mainToobar;
    @BindView(R.id.viewpager)
    ViewPager viewpager;
    @BindViews({R.id.tv_acount, R.id.tv_circle, R.id.tv_me})
    TextView[] textViews;
    @BindView(R.id.acty_tv_title)
    TextView actyTvTitle;
    //点击2次返回，退出程序
    private boolean isExit = false;
    private ActivityUtils activityUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        activityUtils = new ActivityUtils(this);
        init();
    }

    private void init() {
        viewpager.setAdapter(adapter);
        textViews[1].setSelected(true);
        viewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (TextView textView : textViews) {
                    textView.setSelected(false);
                    actyTvTitle.setText(textViews[position].getText());
                    textViews[position].setSelected(true);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private FragmentStatePagerAdapter adapter = new FragmentStatePagerAdapter(getSupportFragmentManager()) {
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new CourseFragment();
                case 1:
                    return new CircleFragment();

                case 2:
                    return new MeFragment();

            }
            return null;
        }

        @Override
        public int getCount() {
            return 3;
        }

    };

    @OnClick({R.id.tv_acount, R.id.tv_circle, R.id.tv_me})
    public void onClick(TextView view) {
        for (int i = 0; i < textViews.length; i++) {
            textViews[i].setSelected(false);
            textViews[i].setTag(i);
        }
        //设置选择效果
        view.setSelected(true);
        //参数false代表瞬间切换，而不是平滑过渡
        viewpager.setCurrentItem((Integer) view.getTag(), false);
        //设置一下toolbar的title
        actyTvTitle.setText(textViews[(Integer) view.getTag()].getText());
    }

    @Override
    public void onBackPressed() {
        if (!isExit) {
            isExit = true;
            activityUtils.showToast("再摁一次退出程序");
            //两秒内再次点击返回则退出
            //如果两秒内，用户没有再次点击，则把isExit设置为false
            viewpager.postDelayed(new Runnable() {
                @Override
                public void run() {
                    isExit = false;
                }
            }, 2000);
        } else {
            finish();
        }
    }
}
