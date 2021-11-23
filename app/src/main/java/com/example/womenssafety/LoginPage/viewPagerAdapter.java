package com.example.womenssafety.LoginPage;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class viewPagerAdapter extends FragmentPagerAdapter {

    int tabcount;
    public viewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount=behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new login_frag();
            case 1:
                return new register_frag();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
