package com.example.hackpsu2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;

public class Register extends AppCompatActivity {
    private String TAG = "Test";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        Log.d(TAG, "onCreate: This is Register");
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction()==event.ACTION_DOWN ) {
            float x = event.getX();
            float y = event.getY();
            Display display = getWindowManager().getDefaultDisplay();
            Point size = new Point();
            display.getSize(size);
            int width = size.x;
            int height = size.y;
            //Log.d(TAG, "onTouchEvent: WIDTH = " + width + "  HEIGHT = " + height + "  SIZE = " + size);
            //Log.d(TAG, "onTouchEvent: This is x: " + x + " This is y: " + y);
            Log.d(TAG, "onTouchEvent: PRESSED! Changing Activity");
            Intent intent = new Intent(this, MainPage.class);
            startActivity(intent);
            finish();
        }
        return false;
    }
}
