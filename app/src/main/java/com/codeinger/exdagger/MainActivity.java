package com.codeinger.exdagger;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.codeinger.exdagger.component.ActivityComponent;
import com.codeinger.exdagger.component.ApplicationComponent;
import com.codeinger.exdagger.model.Battery;
import com.codeinger.exdagger.model.Camera;

import javax.inject.Inject;


//   Application ---- Camera
//   Activity --- Battery
//   Fragment --- Processor


public class MainActivity extends AppCompatActivity {

    ActivityComponent component;

    @Inject
    Battery battery1;

    @Inject
    Battery battery2;

    @Inject
    Camera camera1;

    @Inject
    Camera camera2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        replace(new MainFragment());

        ApplicationComponent applicationComponent = ((MainApplication) getApplicationContext()).getComponent();
        component = applicationComponent.getActivityComponent();

        component.injectActivity(this);


        Log.i("sjahcvjhds", "================Activity:============ ");
        Log.i("sjahcvjhds", "Activity: " + battery1);
        Log.i("sjahcvjhds", "Activity: " + battery2);

        Log.i("sjahcvjhds", "Activity: " + camera1);
        Log.i("sjahcvjhds", "Activity: " + camera2);

    }

    public ActivityComponent getComponent() {
        return component;
    }

    void replace(Fragment fragment) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frame, fragment);
        ft.commit();
    }


}
