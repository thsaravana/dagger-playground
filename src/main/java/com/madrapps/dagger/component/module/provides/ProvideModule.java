package com.madrapps.dagger.component.module.provides;

import com.madrapps.dagger.component.models.Truck;
import com.madrapps.dagger.component.models.Vehicle;
import dagger.Module;
import dagger.Provides;

@Module
public class ProvideModule {

    @Provides
    Vehicle produceTruckAsVehicle() {
        return new Truck();
    }
}
