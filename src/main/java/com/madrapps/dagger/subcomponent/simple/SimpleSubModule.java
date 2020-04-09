package com.madrapps.dagger.subcomponent.simple;

import com.madrapps.dagger.models.Truck;
import com.madrapps.dagger.models.Vehicle;
import dagger.Module;
import dagger.Provides;

@Module
public class SimpleSubModule {

    @Provides
    public static Vehicle getVehicle() {
        return new Truck();
    }
}
