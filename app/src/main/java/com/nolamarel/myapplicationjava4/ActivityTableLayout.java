package com.nolamarel.myapplicationjava4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityTableLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);
    }

    public void onMyButtonClick2(View view){
        Intent intent = new Intent(ActivityTableLayout.this, ActivityFrameLayout.class);
        startActivity(intent);
    }

}