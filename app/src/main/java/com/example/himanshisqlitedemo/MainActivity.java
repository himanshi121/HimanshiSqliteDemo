package com.example.himanshisqlitedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.himanshisqlitedemo.dao.MySqliteHelper;
import com.example.himanshisqlitedemo.model.Course;

public class MainActivity extends AppCompatActivity {

    MySqliteHelper helper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helper = new MySqliteHelper(this);

        Course c = new Course("Java",45,10.50f);
        helper.addCourse(c);

    }
}
