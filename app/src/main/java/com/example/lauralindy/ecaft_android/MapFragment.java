package com.example.lauralindy.ecaft_android;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/**
 * Created by lauralindy on 4/16/18.
 */

public class MapFragment extends Fragment{
    private ImageView imageView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedinstance){
        View v = inflater.inflate(
                R.layout.map_fragment, container, false);
        Bundle args = getArguments();

        SubsamplingScaleImageView imageView = (SubsamplingScaleImageView)
                v.findViewById(R.id.imageView);
        imageView.setImage(ImageSource.resource(R.drawable
                .final_map_draft_11));


        getActivity().setTitle("Map");

        return v;
    }

    @Override
    public void onResume() {
        super.onResume();
        MainActivity.bottomNavigationView.setSelectedItemId(R.id.navigation_map);
    }
}
