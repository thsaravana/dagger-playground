package com.madrapps.dagger.singleton.provides;

import com.madrapps.dagger.models.Truck;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class SingletenProvidesModule {

    @Singleton
    @Provides
    Truck getTruck() {
        return new Truck();
    }
}
