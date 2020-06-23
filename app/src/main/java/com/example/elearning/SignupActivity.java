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

public class SignupActivity extends AppCompatActivity {

    TextView account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        account=(TextView)findViewById(R.id.tv_account);
        String text="Have an Account?\nSign In";
        Spannable span=new SpannableString(text);
        ForegroundColorSpan fcsGray=new ForegroundColorSpan(Color.GRAY);
        ForegroundColorSpan fcsWhite=new ForegroundColorSpan(Color.WHITE);

        span.setSpan(fcsGray,0,16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        span.setSpan(fcsWhite,17,23,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        account.setText(span);

        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SignupActivity.this,SignInActivity.class);
                startActivity(intent);
            }
        });
    }
}
