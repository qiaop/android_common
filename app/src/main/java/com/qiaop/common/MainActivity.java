package com.qiaop.common;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.qiaop.common.imageloader.ImageLoader;
import com.qiaop.common.imageloader.ImageLoaderUtil;

/**
 * Created by qiaopeng0809@gmail.com on 2018/5/9.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageLoader imageLoader = new ImageLoader.Builder().url("").imgView(null).build();
        new ImageLoaderUtil().loadImage(this,imageLoader);
    }
}
