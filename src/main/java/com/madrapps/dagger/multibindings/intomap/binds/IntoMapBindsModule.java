package com.madrapps.dagger.multibindings.intomap.binds;

import com.madrapps.dagger.models.Car;
import com.madrapps.dagger.models.Truck;
import com.madrapps.dagger.models.Vehicle;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module
public abstract class IntoMapBindsModule {

    @Binds
    @IntoMap
    @StringKey("car")
    abstract Vehicle getCar(Car car);

    @Binds
    @IntoMap
    @StringKey("truck")
    abstract Vehicle getTruck(Truck truck);
}
