package com.example.womenssafety.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.womenssafety.fragment.LoginFragment;
import com.example.womenssafety.fragment.RegisterFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    int tabcount;
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount=behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new LoginFragment();
            case 1:
                return new RegisterFragment();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
