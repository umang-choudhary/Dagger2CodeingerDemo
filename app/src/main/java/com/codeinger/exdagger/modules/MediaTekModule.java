package com.codeinger.exdagger.modules;

import com.codeinger.exdagger.model.MediaTek;
import com.codeinger.exdagger.model.Proccessor;
import com.codeinger.exdagger.scops.FragmentScope;

import dagger.Binds;
import dagger.Module;

@Module
public interface MediaTekModule {

    @FragmentScope
    @Binds
    Proccessor getProcessor(MediaTek mediaTek);

}
