package com.madrapps.dagger.component.module.provides.stat;

import com.madrapps.dagger.component.models.Truck;
import com.madrapps.dagger.component.models.Vehicle;
import dagger.Module;
import dagger.Provides;

@Module
public class StaticProvideModule {

    @Provides
    public static Vehicle provideTruckAsVehicle() {
        return new Truck();
    }
}
