package com.madrapps.dagger.component.singleton.provides;

import com.madrapps.dagger.component.models.Truck;
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
