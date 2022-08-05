package com.example.womenssafety.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.womenssafety.R;
import com.example.womenssafety.databinding.FragmentRegisterFragBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import org.jetbrains.annotations.NotNull;


public class RegisterFragment extends Fragment {
    FragmentRegisterFragBinding dataBinding;
    FirebaseAuth firebaseAuth;
    String f_username, f_password, f_c_password;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        dataBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_register_frag, container, false);
        View view = dataBinding.getRoot();
        firebaseAuth = FirebaseAuth.getInstance();
        dataBinding.logbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("Details", f_username + f_password + f_c_password);
                firebaseAuth.createUserWithEmailAndPassword(dataBinding.username.getText().toString(), dataBinding.password.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull @NotNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Log.d("Details Submit", f_username + f_password + f_c_password);
                            Toast.makeText(getActivity(), "Details Submitted", Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }
        });
        return view;
    }
}