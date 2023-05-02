package com.codeinger.exdagger;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.codeinger.exdagger.component.ActivityComponent;
import com.codeinger.exdagger.component.FragmentComponent;
import com.codeinger.exdagger.model.Battery;
import com.codeinger.exdagger.model.Camera;
import com.codeinger.exdagger.model.Mobile;
import com.codeinger.exdagger.model.Proccessor;

import javax.inject.Inject;


public class MainFragment extends Fragment {

    private View view;

    FragmentComponent component;

    @Inject
    Proccessor proccessor1;

    @Inject
    Proccessor proccessor2;

    @Inject
    Battery battery1;

    @Inject
    Battery battery2;

    @Inject
    Camera camera1;

    @Inject
    Camera camera2;

    @Inject
    Mobile mobile1;

    @Inject
    Mobile mobile2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_main, container, false);

        ActivityComponent activityComponent = ((MainActivity) getActivity()).getComponent();

        component = activityComponent.getFragmentComponentBuilder().setClockSpeed(3).setCore(8).build();
        component.injectFragment(MainFragment.this);

        Log.i("sjahcvjhds", "===========Fragment:======== ");
        Log.i("sjahcvjhds", "Fragment: " + proccessor1);
        Log.i("sjahcvjhds", "Fragment: " + proccessor2);

        Log.i("sjahcvjhds", "Fragment: " + battery1);
        Log.i("sjahcvjhds", "Fragment: " + battery2);

        Log.i("sjahcvjhds", "Fragment: " + camera1);
        Log.i("sjahcvjhds", "Fragment: " + camera2);

        Log.i("sjahcvjhds", "Fragment: " + mobile1);
        Log.i("sjahcvjhds", "Fragment: " + mobile2);

        return view;
    }
}