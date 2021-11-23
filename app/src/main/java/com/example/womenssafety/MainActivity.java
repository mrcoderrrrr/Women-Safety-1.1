package com.example.womenssafety;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.womenssafety.LoginPage.viewPagerAdapter;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import java.nio.file.Files;

public class MainActivity extends AppCompatActivity {
ImageView logo;
TextView logotxt;
TabLayout tabLayout;
TabItem logintab,registertab;
ViewPager viewPager;
viewPagerAdapter adapter;
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
        adapter=new viewPagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
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