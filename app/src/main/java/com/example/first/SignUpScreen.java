package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SignUpScreen extends AppCompatActivity {

    private EditText emailInput;
    private  EditText passInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_screen);

        emailInput = findViewById(R.id.email_sign_up);

        passInput = findViewById(R.id.password_sign_up);
    }

    public void GoToFirstAct(View v) {
        Intent intent = new Intent(this,SignInScreen.class);
        intent.putExtra("name",emailInput.getText().toString());
        intent.putExtra("name2",passInput.getText().toString());
        startActivity(intent);

    }
}