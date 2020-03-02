package com.madrapps.dagger.component.multibindings.intomap.provides;

import com.madrapps.dagger.component.models.Car;
import com.madrapps.dagger.component.models.Cycle;
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
