package com.codeinger.exdagger;

import android.app.Application;
import android.util.Log;

import com.codeinger.exdagger.component.ApplicationComponent;
import com.codeinger.exdagger.component.DaggerApplicationComponent;
import com.codeinger.exdagger.model.Camera;

import javax.inject.Inject;


public class MainApplication extends Application {

    ApplicationComponent component;

    @Inject
    Camera camera1;

    @Inject
    Camera camera2;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder().setMp(108).build();
        component.injectApplication(this);

        Log.i("sjahcvjhds", "================Application:============ ");
        Log.i("sjahcvjhds", "Application: " + camera1);
        Log.i("sjahcvjhds", "Application: " + camera2);

    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
