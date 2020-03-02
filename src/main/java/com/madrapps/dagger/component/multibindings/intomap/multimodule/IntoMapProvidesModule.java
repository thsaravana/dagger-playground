package com.madrapps.dagger.component.multibindings.intomap.multimodule;

import com.madrapps.dagger.component.models.Truck;
import com.madrapps.dagger.component.models.Vehicle;
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
