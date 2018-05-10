package com.qiaop.common;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.qiaop.apt_annotation.BindView;
import com.qiaop.apt_library.BindViewTools;

/**
 * Created by qiaopeng0809@gmail.com on 2018/5/10.
 */
public class AptActivity extends AppCompatActivity {

    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.button)
    Button button;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apt);

        BindViewTools.bind(this);

        textView.setText("bind TextView Success");
        button.setText("bind Button Success");
    }
}
