package com.madrapps.dagger.multibindings.intoset.multimodule;

import com.madrapps.dagger.models.Car;
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
    abstract Vehicle bindCarAsVehicle(Car car);
}
