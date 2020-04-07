package com.madrapps.dagger.multibindings.elementsintoset.multimodule;

import com.madrapps.dagger.models.Car;
import com.madrapps.dagger.models.Vehicle;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoSet;

@Module
public abstract class ElementsIntoSetBindsModule {

    @Binds
    @IntoSet
    abstract Vehicle bindCarAsVehicle(Car car);
}
