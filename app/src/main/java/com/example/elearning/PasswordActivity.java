package com.example.elearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class PasswordActivity extends AppCompatActivity {

    Button login;
    TextView forgotPassword;

    EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);

        login = (Button) findViewById(R.id.btn_next);
        forgotPassword=(TextView)findViewById(R.id.tv_forgotPass);
        etPassword=(EditText)findViewById(R.id.et_pass);


        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PasswordActivity.this, ForgotPassword.class);
                startActivity(intent);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PasswordActivity.this,HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
