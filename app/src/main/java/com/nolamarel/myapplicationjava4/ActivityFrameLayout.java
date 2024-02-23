package com.nolamarel.myapplicationjava4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityFrameLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);
    }

    public void onMyButtonClick3(View view){
        Intent intent = new Intent(ActivityFrameLayout.this, ActivityGridLayout.class);
        startActivity(intent);
    }

}