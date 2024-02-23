package com.nolamarel.myapplicationjava4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityGridLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);
    }

    public void onMyButtonClick4(View view){
        Intent intent = new Intent(ActivityGridLayout.this, ActivityScrollView.class);
        startActivity(intent);
    }

}