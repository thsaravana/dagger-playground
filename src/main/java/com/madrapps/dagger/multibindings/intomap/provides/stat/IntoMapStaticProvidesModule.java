package com.madrapps.dagger.multibindings.intomap.provides.stat;

import com.madrapps.dagger.models.Cycle;
import com.madrapps.dagger.models.Truck;
import com.madrapps.dagger.models.Vehicle;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module
public class IntoMapStaticProvidesModule {

    @Provides
    @IntoMap
    @StringKey("cycle")
    static Vehicle getCycle() {
        return new Cycle();
    }

    @Provides
    @IntoMap
    @StringKey("truck")
    static Vehicle getTruck(){
        return new Truck();
    }
}
