package com.example.navigation_component_tablayout_with_custom_transition_animation_and_navigation_listener.View;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigation_component_tablayout_with_custom_transition_animation_and_navigation_listener.R;


public class nav_host_fragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nav_host_fragment, container, false);
    }
}