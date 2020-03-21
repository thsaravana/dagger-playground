package com.madrapps.dagger.multibindings.intomap.multimodule;

import com.madrapps.dagger.models.Car;
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
    abstract Vehicle bindCarAsVehicle(Car car);
}
