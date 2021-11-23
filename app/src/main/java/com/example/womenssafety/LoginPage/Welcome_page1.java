package com.example.womenssafety.LoginPage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.womenssafety.R;

public class Welcome_page1 extends AppCompatActivity {
    TextView welcome,womentxt,next;
    Intent intent=getIntent();
    Animation welcome_anim,women_anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page1);

        welcome=findViewById(R.id.welcome);
        womentxt=findViewById(R.id.womentxt);
        next=findViewById(R.id.next);
        welcome_anim= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.text_animation);
        women_anim= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.women_text);
        welcome.setAnimation(welcome_anim);
        womentxt.setAnimation(women_anim);

        //go to enter details activity
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent details=new Intent(getApplicationContext(),Details_page2.class);
                startActivity(details);
            }
        });
    }
}