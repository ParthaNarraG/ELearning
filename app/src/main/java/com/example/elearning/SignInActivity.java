package com.example.elearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;

public class SignInActivity extends AppCompatActivity {

    TextView email,signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        email=(TextView)findViewById(R.id.tv_sign_email);
        signup=(TextView)findViewById(R.id.tv_signup);

        String text="New here? Create an Account";

        Spannable span=new SpannableString(text);
        ForegroundColorSpan fcsGray=new ForegroundColorSpan(Color.GRAY);
        ForegroundColorSpan fcsWhite=new ForegroundColorSpan(Color.WHITE);
        span.setSpan(fcsGray,0,9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        span.setSpan(fcsWhite,10,27,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        signup.setText(span);

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SignInActivity.this,LoginScreen.class);
                startActivity(intent);
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SignInActivity.this,SignupActivity.class);
                startActivity(intent);
            }
        });
    }
}
