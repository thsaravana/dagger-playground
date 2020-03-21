package com.madrapps.dagger.module.provides;

import com.madrapps.dagger.models.Truck;
import com.madrapps.dagger.models.Vehicle;
import dagger.Module;
import dagger.Provides;

@Module
public class ProvideModule {

    @Provides
    Vehicle provideTruckAsVehicle() {
        return new Truck();
    }
}
