package com.madrapps.dagger.module.provides.stat;

import com.madrapps.dagger.models.Truck;
import com.madrapps.dagger.models.Vehicle;
import dagger.Module;
import dagger.Provides;

@Module
public class StaticProvideModule {

    @Provides
    public static Vehicle provideTruckAsVehicle() {
        return new Truck();
    }
}
