package com.codepath.rkpandey.a651615651.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.codepath.rkpandey.a651615651.Adapters.UsersAdapter;
import com.codepath.rkpandey.a651615651.ChatDetailActivity;
import com.codepath.rkpandey.a651615651.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.FirebaseDatabase;
import android.content.Intent;
import android.widget.Toast;

import okhttp3.internal.cache.DiskLruCache;


public class CallsFragment extends Fragment {

    //ArrayList<Users> list;

    private TextView username;
    private TextView email;
    private FirebaseDatabase database;
    private FirebaseAuth auth;

    public CallsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calls, container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        //Users users = list.get(position);
        username = view.findViewById(R.id.ourUsername);
        email = view.findViewById(R.id.ourEmail);

        database = FirebaseDatabase.getInstance();
        username.setText(database.getReference().toString());
        //intent.putExtra("userId", users.getUserId());
    }
}
