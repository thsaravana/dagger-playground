package com.madrapps.dagger.component.multibindings.intomap.binds;

import com.madrapps.dagger.component.models.Car;
import com.madrapps.dagger.component.models.Truck;
import com.madrapps.dagger.component.models.Vehicle;
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
