package com.madrapps.dagger.subcomponent.direct;

import com.madrapps.dagger.models.Truck;
import com.madrapps.dagger.models.Vehicle;
import dagger.Module;
import dagger.Provides;

@Module
public class SampleModule {

    @Provides
    Vehicle vechicle() {
        return new Truck();
    }
}
