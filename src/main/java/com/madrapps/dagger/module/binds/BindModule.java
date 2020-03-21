package com.madrapps.dagger.module.binds;

import com.madrapps.dagger.models.Car;
import com.madrapps.dagger.models.Vehicle;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class BindModule {

    @Binds
    abstract Vehicle bindCarToVehicle(Car car);
}
