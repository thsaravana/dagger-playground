package com.madrapps.dagger.subcomponent.multiple;

import com.madrapps.dagger.models.Truck;
import com.madrapps.dagger.models.Vehicle;
import dagger.Module;
import dagger.Provides;

@Module
public class MultipleParentModule {

    @Provides
    Vehicle vehicle() {
        return new Truck();
    }
}
