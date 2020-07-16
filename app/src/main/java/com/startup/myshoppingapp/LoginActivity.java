package com.startup.myshoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickLogin(View view)
    {
        Intent intent = new Intent(this, HomeScreenActivity.class);
        EditText  editText_UserName= (EditText) findViewById(R.id.txt_username);
        String userName = editText_UserName.getText().toString();

        EditText editText_password = (EditText) findViewById(R.id.txt_password);
        String password = editText_password.getText().toString();

        intent.putExtra("userName", userName);
        startActivity(intent);
    }
}