package com.liez.tyas.materialme.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.liez.tyas.materialme.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class SupportDesignActivity extends AppCompatActivity {

    @Bind(R.id.image_header)
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support_design);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Glide.with(this)
                .load(R.drawable.image_car_1)
                .into(imageView);
    }

}
