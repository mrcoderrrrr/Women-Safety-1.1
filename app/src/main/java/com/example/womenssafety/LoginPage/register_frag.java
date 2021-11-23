package com.example.womenssafety.LoginPage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.womenssafety.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import org.jetbrains.annotations.NotNull;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link register_frag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class register_frag extends Fragment {
    TextView nametxt, usernametxt, passwordtxt, c_passwrordtxt, phonetxt;
    EditText name, username, password, c_password, phone;
    Button loginbut;
    FirebaseAuth firebaseAuth;
    FirebaseUser firebaseUser;
    String f_username, f_password, f_c_password;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public register_frag() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment register_frag.
     */
    // TODO: Rename and change types and number of parameters
    public static register_frag newInstance(String param1, String param2) {
        register_frag fragment = new register_frag();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_register_frag, container, false);
        nametxt = view.findViewById(R.id.name_txt);
        name = view.findViewById(R.id.name);
        usernametxt = view.findViewById(R.id.username_txt);
        passwordtxt = view.findViewById(R.id.password_txt);
        c_passwrordtxt = view.findViewById(R.id.c_password_txt);
        c_password = view.findViewById(R.id.c_password);
        username = view.findViewById(R.id.username);
        password = view.findViewById(R.id.password);
        loginbut = view.findViewById(R.id.logbut);
        phonetxt = view.findViewById(R.id.phone_txt);
        phone = view.findViewById(R.id.phone);
        firebaseAuth = FirebaseAuth.getInstance();
        loginbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f_username = username.getText().toString();
                f_password = password.getText().toString();
                f_c_password = c_password.getText().toString();
                Log.d("Details", f_username + f_password + f_c_password);
                firebaseAuth.createUserWithEmailAndPassword(f_username,f_c_password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull @NotNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Log.d("Details Submit", f_username + f_password + f_c_password);
                            Toast.makeText(getActivity(),"Details Submitted",Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }
        });
        return view;
    }
}