package com.madrapps.dagger.multibindings.intomap.multimodule;

import com.madrapps.dagger.models.Truck;
import com.madrapps.dagger.models.Vehicle;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module
public class IntoMapProvidesModule {

    @Provides
    @IntoMap
    @StringKey("truck")
    Vehicle provideTruckAsVehicle() {
        return new Truck();
    }
}
