package com.codeinger.exdagger.component;

import com.codeinger.exdagger.MainActivity;
import com.codeinger.exdagger.modules.BatteryModule;
import com.codeinger.exdagger.scops.ActivityScope;

import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = {BatteryModule.class})
public interface ActivityComponent {

    FragmentComponent.Builder getFragmentComponentBuilder();

    void injectActivity(MainActivity mainActivity);

}
