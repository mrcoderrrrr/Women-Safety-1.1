package com.example.womenssafety.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.womenssafety.R;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView text;
        ImageView icon;
        Handler handler;
        Animation logoanim;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        text=findViewById(R.id.text1);
        icon=findViewById(R.id.icon1);
        //splash screen -- Animation
        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreenActivity.this, MainActivity.class));
                finish();
            }
        },2000);
    //logo animation fade in
    logoanim= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.logo_fade_in);
    icon.setAnimation(logoanim);
    text.setAnimation(logoanim);
    }

}
