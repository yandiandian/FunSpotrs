package com.example.funspotrs.user;


import android.content.res.AssetFileDescriptor;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;

import com.example.funspotrs.R;
import com.example.funspotrs.common.ActivityUtils;

import java.io.FileDescriptor;
import java.io.IOException;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstMP4Fragment extends Fragment implements TextureView.SurfaceTextureListener {
    private TextureView mTextureView;
    private ActivityUtils mActivityUtils;
    private MediaPlayer mMediaPlayer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mActivityUtils = new ActivityUtils(this);
        // fragment全屏显示播放视频的控件
        mTextureView = new TextureView(getContext());
        return mTextureView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // 设置监听：因为播放显示内容需要SurfaceTexture，所以设置一个监听，看SurfaceTexture有没有准备好或有没有变化等
        mTextureView.setSurfaceTextureListener(this);
    }
    @Override
    public void onSurfaceTextureAvailable(final SurfaceTexture surface, int width, int height) {
        try {
            // 打开播放的资源文件
            AssetFileDescriptor openFd = getContext().getAssets().openFd("welcome.mp4");
            // 拿到MediaPlayer需要的资源类型
            FileDescriptor fileDescriptor = openFd.getFileDescriptor();
            mMediaPlayer = new MediaPlayer();
            // 设置播放的资源给MediaPlayer
            mMediaPlayer.setDataSource(fileDescriptor, openFd.getStartOffset(), openFd.getLength());
            mMediaPlayer.prepareAsync();// 异步
            mMediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    Surface mySurface = new Surface(surface);
                    mMediaPlayer.setSurface(mySurface);
                    mMediaPlayer.setLooping(true);// 循环播放
                    mMediaPlayer.seekTo(0);
                    mMediaPlayer.start();
                }
            });
        } catch (IOException e) {
            mActivityUtils.showToast("媒体文件播放失败了");
        }
    }

    @Override
    public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) {
    }

    @Override
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surface) {
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mMediaPlayer != null) {
            mMediaPlayer.release();
            mMediaPlayer = null;
        }
    }
}
