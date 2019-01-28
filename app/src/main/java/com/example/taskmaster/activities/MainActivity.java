package com.example.taskmaster.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.taskmaster.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void goToCreateProject(View v) {
        Intent exerciseDiaryIntent = new Intent(this, CreateProject.class);
        startActivity(exerciseDiaryIntent);
    }


}
