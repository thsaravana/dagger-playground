package com.madrapps.dagger.multibindings.intoset.binds;

import com.madrapps.dagger.models.Car;
import com.madrapps.dagger.models.Truck;
import com.madrapps.dagger.models.Vehicle;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import dagger.multibindings.StringKey;

@Module
public abstract class IntoSetBindsModule {

    @Binds
    @IntoSet
    abstract Vehicle getCar(Car car);

    @Binds
    @IntoSet
    abstract Vehicle getTruck(Truck truck);
}
