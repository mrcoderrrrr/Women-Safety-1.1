package com.example.womenssafety.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.womenssafety.R;

public class DetailsPageActivity extends AppCompatActivity {
    TextView entertxt, nametxt, mobiletxt, addresstxt;
    EditText name, mobile, address;
    Button submit;
    Animation enteranim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_page2);
        entertxt = findViewById(R.id.entertxt);
        nametxt = findViewById(R.id.name_txt);
        mobiletxt = findViewById(R.id.mobile_no);
        addresstxt = findViewById(R.id.address);
        name= findViewById(R.id.name);
        mobile = findViewById(R.id.mobile);
        address = findViewById(R.id.address_txt);
        submit=findViewById(R.id.submit);

        //Animation
        enteranim= AnimationUtils.loadAnimation(getApplicationContext(), R.anim.text_animation);
        entertxt.setAnimation(enteranim);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home_page=new Intent(getApplicationContext(), HomeScreenActivity.class);
                startActivity(home_page);
            }
        });

    }
}