package com.example.navigation_component_tablayout_with_custom_transition_animation_and_navigation_listener.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;

import android.os.Bundle;

import com.example.navigation_component_tablayout_with_custom_transition_animation_and_navigation_listener.R;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);

        NavOptions navOptions = new NavOptions.Builder()
                .setLaunchSingleTop(true)
                .setPopUpTo(navController.getGraph().getStartDestination(), false)
                .build();

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 0:
                        navController.navigate(R.id.homeFragment, null, navOptions);
                        break;
                    case 1:
                        navController.navigate(R.id.requestsFragment, null, navOptions);
                        break;
                    case 2:
                        navController.navigate(R.id.chatFragment, null, navOptions);
                        break;
                    case 3:
                        navController.navigate(R.id.notificationsFragment, null, navOptions);
                        break;
                    case 4:
                        navController.navigate(R.id.profileFragment, null, navOptions);
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public void onBackPressed() {
        tabLayout.getTabAt(0).select();
        super.onBackPressed();
    }
}