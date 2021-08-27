package com.example.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText inputUsername, inputPassword;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputUsername = (EditText) findViewById(R.id.inputUsername);
        inputPassword = (EditText) findViewById(R.id.inputPassword);

        loginButton = (Button) findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Check();
            }
        });

    }
    public void Check() {
        if (inputUsername.getText().toString().equals("20193569") && inputPassword.getText().toString().equals("12345")){
            Intent i = new Intent(this, ephraim_account.class);
            startActivity(i);
        }

        else if (inputUsername.getText().toString().equals("20194666") && inputPassword.getText().toString().equals("12345")){
            Intent i = new Intent(this, cortez_account.class);
            startActivity(i);
        }

        else if (inputUsername.getText().toString().equals("20182141") && inputPassword.getText().toString().equals("12345")){
            Intent i = new Intent(this, javar_account.class);
            startActivity(i);
        }

        else if (inputUsername.getText().toString().equals("20193456") && inputPassword.getText().toString().equals("12345")){
            Intent i = new Intent(this, natividad_account.class);
            startActivity(i);
        }

        else{
            Toast.makeText(this,"Login Failed",Toast.LENGTH_LONG).show();
        }
    }
}