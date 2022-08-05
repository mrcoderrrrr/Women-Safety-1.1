package com.example.womenssafety.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.womenssafety.adapter.ViewPagerAdapter;
import com.example.womenssafety.R;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
ImageView logo;
TextView logotxt;
TabLayout tabLayout;
TabItem logintab,registertab;
ViewPager viewPager;
ViewPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logo=findViewById(R.id.logoimg);
        logotxt=findViewById(R.id.logotext);
        tabLayout=findViewById(R.id.tablayout);
        logintab=findViewById(R.id.logintab);
        registertab= findViewById(R.id.registertab);
        viewPager=findViewById(R.id.viewpager);
        adapter=new ViewPagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        tabLayoutclass();
    }

    private void tabLayoutclass() {
    tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
        @Override
        public void onTabSelected(TabLayout.Tab tab) {
            viewPager.setCurrentItem(tab.getPosition());
            
            if(tab.getPosition() == 0 || tab.getPosition() == 1 ){
                adapter.notifyDataSetChanged();
            }
        }

        @Override
        public void onTabUnselected(TabLayout.Tab tab) {

        }

        @Override
        public void onTabReselected(TabLayout.Tab tab) {

        }
    });

    viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    //listen page and slide
    }
}