package com.madrapps.dagger.component.subcomponent;

import com.madrapps.dagger.component.models.Truck;
import com.madrapps.dagger.component.models.Vehicle;
import dagger.Module;
import dagger.Provides;

@Module
public class SampleModule {

    @Provides
    Vehicle vechicle() {
        return new Truck();
    }
}
