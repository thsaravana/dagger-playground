package com.madrapps.dagger.multibindings.intoset.multimodule;

import com.madrapps.dagger.models.Truck;
import com.madrapps.dagger.models.Vehicle;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import dagger.multibindings.StringKey;

@Module
public class IntoSetProvidesModule {

    @Provides
    @IntoSet
    Vehicle provideTruckAsVehicle() {
        return new Truck();
    }
}
