package com.madrapps.dagger.component.module;

import com.madrapps.dagger.component.models.Car;
import com.madrapps.dagger.component.models.Vehicle;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class BindModule {

    @Binds
    abstract Vehicle bindCarToVehicle(Car car);
}
