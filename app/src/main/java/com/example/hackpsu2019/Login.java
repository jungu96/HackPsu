package com.example.hackpsu2019;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    private EditText mPhoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        mPhoneNumber = (EditText) findViewById(R.id.login_phone);
        Button loginButton = (Button) findViewById(R.id.login_button_login);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneEntered = mPhoneNumber.getText().toString();

                Intent intent = new Intent(Login.this, Verification.class);
                intent.putExtra("mobile", phoneEntered);
                startActivity(intent);

            }
        });
    }
}