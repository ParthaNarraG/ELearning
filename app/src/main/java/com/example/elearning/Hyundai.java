package com.example.elearning;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Hyundai extends AppCompatActivity {

    ImageView download;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_gallery);
        download=(ImageView)findViewById(R.id.download_ico);
        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                download.setImageResource(R.drawable.pause_btn_drawable);
            }
        });
    }
}
