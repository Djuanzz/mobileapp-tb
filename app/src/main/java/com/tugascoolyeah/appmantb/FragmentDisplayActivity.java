package com.tugascoolyeah.appmantb;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class FragmentDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_display);

        // Get the fragment identifier from the intent
        Intent intent = getIntent();
        String fragmentToLoad = intent.getStringExtra("fragmentToLoad");

        // Determine which fragment to load based on the intent extra
        Fragment fragment = null;
//        if ("EMRFragment".equals(fragmentToLoad)) {
//            fragment = new EMRFragment();
//        } else if ("AccountFragment".equals(fragmentToLoad)) {
//            fragment = new AccountFragment();
//        }

        // Load the fragment if it's not null
//        if (fragment != null) {
//            loadFragment(fragment);
//        }
    }

    // Helper method to load the fragment into the container
    private void loadFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fragment_container, fragment);
        transaction.commit();
    }
}
