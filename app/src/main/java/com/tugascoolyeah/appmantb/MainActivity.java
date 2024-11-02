package com.tugascoolyeah.appmantb;
import com.tugascoolyeah.appmantb.R;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private ImageButton imageButton11, imageButton14, imgbuttonlainnyaDB;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coba_activity_main);

        // Initialize buttons
        imageButton11 = findViewById(R.id.imageButton11);
        imageButton14 = findViewById(R.id.imageButton14);
        imgbuttonlainnyaDB = findViewById(R.id.imgbuttonlainnyaDB);
        bottomNavigationView = findViewById(R.id.bottom_navigation);

        // In your MainActivity
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Intent intent = new Intent(MainActivity.this, FragmentDisplayActivity.class);
                if (item.getItemId() == R.id.nav_emr) {
                    intent.putExtra("fragmentToLoad", "EMRFragment");
                    startActivity(intent);
                    return true;
                } else if (item.getItemId() == R.id.nav_account) {
                    intent.putExtra("fragmentToLoad", "AccountFragment");
                    startActivity(intent);
                    return true;
                }
                return false;
            }
        });
        // Set up the bottom navigation view
//        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                int itemId = item.getItemId();
//                if (itemId == R.id.nav_emr) {
//                    Log.d("MainActivity", "Loading EMR Fragment");
//                    loadFragment(new EMRFragment());
//                    return true;
//                } else if (itemId == R.id.nav_account) {
//                    Log.d("MainActivity", "Loading Account Fragment");
//                    loadFragment(new AccountFragment());
//                    return true;
//                }
//                return false;
//            }
//        });

        // Set click listeners for the main buttons to open EMRFragment
        View.OnClickListener emrFragmentClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                loadFragment(new EMRFragment());
            }
        };

        imageButton11.setOnClickListener(emrFragmentClickListener);
        imageButton14.setOnClickListener(emrFragmentClickListener);
        imgbuttonlainnyaDB.setOnClickListener(emrFragmentClickListener);
    }

    private void loadFragment(Fragment fragment) {
        Log.d("MainActivity", "Executing loadFragment with " + fragment.getClass().getSimpleName());
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fragment_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
