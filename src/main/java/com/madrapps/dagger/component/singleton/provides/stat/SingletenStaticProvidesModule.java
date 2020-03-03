package com.madrapps.dagger.component.singleton.provides.stat;

import com.madrapps.dagger.component.models.Truck;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class SingletenStaticProvidesModule {

    @Singleton
    @Provides
    static Truck getTruck() {
        return new Truck();
    }
}
