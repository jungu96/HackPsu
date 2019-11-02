package com.example.hackpsu2019;

import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginRegister extends AppCompatActivity {
    private String TAG = "Test"; //This is used for the Log.d function which prints out a text on the console.
    private AutoCompleteTextView mUsernameView;
    private EditText mPasswordView;
    private FirebaseAuth mAuth;
    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_register);
        Log.d(TAG, "onCreate: This is LoginRegister");

        mAuth = FirebaseAuth.getInstance();
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        mUsernameView = (AutoCompleteTextView) findViewById(R.id.login_phone);
        //mPasswordView = (EditText) findViewById(R.id.login_password);

        Button loginButton = (Button)findViewById(R.id.login_button);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginRegister.this, MainPage.class));
            }
        });
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

            if (y < height / 2) {
                Log.d(TAG, "onTouchEvent: ABOVE HALF");
                Intent intent = new Intent(this, MainPage.class);
                startActivity(intent);
                finish();
            } else {
                Log.d(TAG, "onTouchEvent: BELOW HALF!");
                Intent intent = new Intent(this, Register.class);
                startActivity(intent);
                finish();
            }

        }
        return false;
    }
}
