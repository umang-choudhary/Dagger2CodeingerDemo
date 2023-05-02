package com.codeinger.exdagger.component;

import com.codeinger.exdagger.MainApplication;
import com.codeinger.exdagger.MainFragment;
import com.codeinger.exdagger.modules.CameraModule;
import com.codeinger.exdagger.scops.ApplicationScope;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@ApplicationScope
@Component(modules = {CameraModule.class})
public interface ApplicationComponent {

    ActivityComponent getActivityComponent();

    void injectApplication(MainApplication mainApplication);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder setMp(@Named("megapixel") int megapixel);

        ApplicationComponent build();
    }

}
