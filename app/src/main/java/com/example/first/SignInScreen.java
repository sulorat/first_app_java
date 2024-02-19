package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignInScreen extends AppCompatActivity {
    Button sign_up;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

    }public void GoToSecAct(View v) {
        Intent intent = new Intent(this,SignUpScreen.class);
        startActivity(intent);
    }
}