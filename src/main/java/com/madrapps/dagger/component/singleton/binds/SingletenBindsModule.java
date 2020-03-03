package com.madrapps.dagger.component.singleton.binds;

import com.madrapps.dagger.component.models.Truck;
import com.madrapps.dagger.component.models.Vehicle;
import dagger.Binds;
import dagger.Module;

import javax.inject.Singleton;

@Module
public abstract class SingletenBindsModule {

    @Singleton
    @Binds
    abstract Vehicle truckAsVehicle(Truck truck);
}
