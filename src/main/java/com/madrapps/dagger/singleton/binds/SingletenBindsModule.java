package com.madrapps.dagger.singleton.binds;

import com.madrapps.dagger.models.Truck;
import com.madrapps.dagger.models.Vehicle;
import dagger.Binds;
import dagger.Module;

import javax.inject.Singleton;

@Module
public abstract class SingletenBindsModule {

    @Singleton
    @Binds
    abstract Vehicle truckAsVehicle(Truck truck);
}
