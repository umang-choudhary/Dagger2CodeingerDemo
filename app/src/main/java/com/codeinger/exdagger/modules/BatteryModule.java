package com.codeinger.exdagger.modules;

import com.codeinger.exdagger.model.Battery;
import com.codeinger.exdagger.model.Cobalt;
import com.codeinger.exdagger.model.Lithium;

import dagger.Module;
import dagger.Provides;

@Module
public class BatteryModule {

   @Provides
   static Cobalt getCobalt(){
       return new Cobalt();
   }

    @Provides
    static Lithium getLithium(){
       Lithium lithium = new Lithium();
       lithium.done();
       return lithium;
    }

    @Provides
    static Battery getBattery(Lithium lithium,Cobalt cobalt){
       return new Battery(cobalt,lithium);
    }


}
