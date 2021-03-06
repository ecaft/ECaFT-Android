package com.example.lauralindy.ecaft_android;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by lauralindy on 4/17/18.
 */

public class HomeFragment extends Fragment {
    private TextView textView;
    private ImageView image;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // The last two arguments ensure LayoutParams are inflated
        // properly.
        View v = inflater.inflate(
                R.layout.home_fragment, container, false);
        Bundle args = getArguments();
        //textView = (TextView) v.findViewById(R.id.home_fragment_text_view1);
        //image = (ImageView) v.findViewById(R.id.home_fragment_text_view1);

        getActivity().setTitle("Home");

        return v;
    }

    @Override
    public void onResume() {
        super.onResume();
        MainActivity.bottomNavigationView.setSelectedItemId(R.id.navigation_home);
    }
}
