package com.example.womenssafety.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.example.womenssafety.R;

public class HomeScreenActivity extends AppCompatActivity {
    CardView fakecard, screamcard, msgcard, gpscard, emgcard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        fakecard = findViewById(R.id.fakecard);
        screamcard = findViewById(R.id.screamcard);
        msgcard = findViewById(R.id.msgcard);
        gpscard = findViewById(R.id.gpscard);
        emgcard = findViewById(R.id.emgcard);


        //fakecard click
        fakecard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.gridView,new Fake_Call()).commit();*/

            }
        });
        //Scream sound
        screamcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //send messgae
        msgcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //gps
        gpscard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //emergency number
        emgcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


}