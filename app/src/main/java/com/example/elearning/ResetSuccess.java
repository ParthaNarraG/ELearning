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
import android.widget.Button;
import android.widget.TextView;

public class ResetSuccess extends AppCompatActivity {

    TextView resend;
    Button login;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_success);
        resend=(TextView)findViewById(R.id.tv_resend);
        login=(Button)findViewById(R.id.btn_next);
        String text="Didn't get it? Send it again";
        Spannable span=new SpannableString(text);
        ForegroundColorSpan fcsGray=new ForegroundColorSpan(Color.GRAY);
        ForegroundColorSpan fcsWhite=new ForegroundColorSpan(Color.WHITE);
        span.setSpan(fcsGray,0,14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        span.setSpan(fcsWhite,16,28,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        resend.setText(span);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ResetSuccess.this,LoginScreen.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

    }
}
