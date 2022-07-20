package com.example.madprojectemi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class frontpage extends AppCompatActivity {
//    ImageView iv;
    private Handler mHandler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frontpage);
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(frontpage.this, MainActivity.class);
                startActivity(intent);
            }
        }, 4000);
//        iv=(ImageView) findViewById((R.id.e));
//        iv.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent it = new Intent(frontpage.this, MainActivity.class);
//
//                startActivity(it);
//            }
//        });
    }
}