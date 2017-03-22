package com.example.funspotrs.custom;

import android.widget.PopupWindow;

/**
 * Created by 天空 on 2017/3/20 0020.
 */

public class IconSelectWindow extends PopupWindow {
    public interface Listener{
        // 到相册
        void toGallery();

        // 到相机
        void toCamera();

    }
}
