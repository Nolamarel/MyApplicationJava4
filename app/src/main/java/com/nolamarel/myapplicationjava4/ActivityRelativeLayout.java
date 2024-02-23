package com.nolamarel.myapplicationjava4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityRelativeLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);
    }

    public void onMyButtonClick1(View view){
        Intent intent = new Intent(ActivityRelativeLayout.this, ActivityTableLayout.class);
        startActivity(intent);
    }

}