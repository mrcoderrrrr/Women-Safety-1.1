package com.example.womenssafety.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.womenssafety.R;
import com.example.womenssafety.activity.WelcomePageActivity;
import com.example.womenssafety.databinding.FragmentLoginFragBinding;


public class LoginFragment extends Fragment {
    FragmentLoginFragBinding dataBinding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        dataBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_login_frag, container, false);
        View view = dataBinding.getRoot();
        loginbut();
        return view;
    }

    private void loginbut() {

        dataBinding.logbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), WelcomePageActivity.class);
                startActivity(i);
            }
        });
    }
}