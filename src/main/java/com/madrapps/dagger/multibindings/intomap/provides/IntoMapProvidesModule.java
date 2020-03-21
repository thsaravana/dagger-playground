package com.madrapps.dagger.multibindings.intomap.provides;

import com.madrapps.dagger.models.Cycle;
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
    @StringKey("cycle")
    Vehicle getCycle() {
        return new Cycle();
    }

    @Provides
    @IntoMap
    @StringKey("truck")
    Vehicle getTruck(){
        return new Truck();
    }
}
