package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SignUpScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_screen);
    }

    public void GoToFirstAct(View v) {
        Intent intent = new Intent(this,SignInScreen.class);
        startActivity(intent);
        Data_set();
    }
    private void Data_set() {
        EditText emailInput = findViewById(R.id.editText4);
        EditText passInput = findViewById(R.id.editText5);

        User user_data = (User) getIntent().getSerializableExtra(User.class.getName());

        if (user_data != null) {
            emailInput.setText(user_data.Email());
            passInput.setText(user_data.Password());
        }
    }
}