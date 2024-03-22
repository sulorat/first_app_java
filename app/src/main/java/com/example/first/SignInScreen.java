package com.example.first;

import  androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignInScreen extends AppCompatActivity {
    Button sign_up;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

    }
    public void GoToSecAct(View v) {
        EditText email = findViewById(R.id.editText1);
        EditText password = findViewById(R.id.editText2);
        String email_str = email.getText().toString();
        String password_str = password.getText().toString();
        User user_data = new User(email_str,password_str);
        Intent intent = new Intent(this,SignUpScreen.class);
        intent.putExtra(User.class.getName(),user_data);
        startActivity(intent);
    }



}