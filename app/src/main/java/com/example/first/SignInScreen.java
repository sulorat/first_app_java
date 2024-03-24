package com.example.first;

import  androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignInScreen extends AppCompatActivity {
    Button sign_up;
    private EditText email;
    private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        email = (EditText) findViewById(R.id.email);

        password = (EditText) findViewById(R.id.password);

        email.setText(getIntent().getStringExtra("name"));
        password.setText(getIntent().getStringExtra("name2"));

    }
    public void GoToSecAct(View v) {

        Intent intent = new Intent(this,SignUpScreen.class);
        startActivity(intent);
    }



}