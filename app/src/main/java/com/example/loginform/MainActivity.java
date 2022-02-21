package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText username;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        username = findViewById(R.id.uname);
        password = findViewById(R.id.pass);

        btn.setOnClickListener(
             view -> {
                 System.out.println(username.getText());
                 System.out.println(username.getText());
             }
        );

    }


}