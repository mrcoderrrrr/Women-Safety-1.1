package com.example.womenssafety.LoginPage;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.womenssafety.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link login_frag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class login_frag extends Fragment {
TextView usernametxt,passwordtxt;
EditText username,password;
Button loginbut;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public login_frag() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment login_frag.
     */
    // TODO: Rename and change types and number of parameters
    public static login_frag newInstance(String param1, String param2) {
        login_frag fragment = new login_frag();
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
        View view=inflater.inflate(R.layout.fragment_login_frag, container, false);
        usernametxt=view.findViewById(R.id.username_txt);
        passwordtxt=view.findViewById(R.id.password_txt);
        username=view.findViewById(R.id.username);
        password=view.findViewById(R.id.password);
        loginbut=view.findViewById(R.id.logbut);
        loginbut();
    return view;
    }

    private void loginbut() {

    loginbut.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
       Intent i=new Intent(getActivity(),Welcome_page1.class);
       startActivity(i);
        }
    });
    }
}