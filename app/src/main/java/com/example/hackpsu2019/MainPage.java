package com.example.hackpsu2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainPage extends AppCompatActivity {
    private String TAG = "Test";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);
        Log.d(TAG, "onCreate: This is MainPage");
    }
}
