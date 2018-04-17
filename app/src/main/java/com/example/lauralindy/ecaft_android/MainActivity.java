package com.example.lauralindy.ecaft_android;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    Fragment fragment = null;
    FragmentTransaction fragmentTransaction;
    private MapFragment mapFragment = new MapFragment();
    private HomeFragment homeFragment = new HomeFragment();

    public static BottomNavigationView bottomNavigationView;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    fragment = homeFragment;
                    switchFragment(fragment);
                    return true;
                case R.id.navigation_map:
                    fragment = mapFragment;
                    switchFragment(fragment);
                    return true;
                case R.id.navigation_lists:
                    mTextMessage.setText(R.string.title_lists);
                    return true;
                case R.id.navigation_information:
                    mTextMessage.setText(R.string.title_information);
                    return true;
            }
            return false;
        }
    };

    private void switchFragment(Fragment fragment){
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.content_frame, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        bottomNavigationView.setSelectedItemId(R.id.navigation_home);

        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragment = new HomeFragment();
        fragmentTransaction.replace(R.id.content_frame, fragment);
        fragmentTransaction.commit();
    }

}
