package com.qiaop.common;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.qiaop.common.imageloader.ImageLoader;
import com.qiaop.common.imageloader.ImageLoaderUtil;

/**
 * Created by qiaopeng0809@gmail.com on 2018/5/9.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button_apt);
        button.setOnClickListener(this);
//        ImageLoader imageLoader = new ImageLoader.Builder().url("").imgView(null).build();
//        new ImageLoaderUtil().loadImage(this,imageLoader);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_apt:
                Intent intent = new Intent(this,AptActivity.class);
                startActivity(intent);
                break;
        }
    }
}
