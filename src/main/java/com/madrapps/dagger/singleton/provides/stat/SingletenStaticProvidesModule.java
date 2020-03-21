package com.madrapps.dagger.singleton.provides.stat;

import com.madrapps.dagger.models.Truck;
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
