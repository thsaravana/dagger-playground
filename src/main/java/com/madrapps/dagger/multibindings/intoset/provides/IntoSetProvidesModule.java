package com.madrapps.dagger.multibindings.intoset.provides;

import com.madrapps.dagger.models.Cycle;
import com.madrapps.dagger.models.Truck;
import com.madrapps.dagger.models.Vehicle;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;

@Module
public class IntoSetProvidesModule {

    @Provides
    @IntoSet
    Vehicle getCycle() {
        return new Cycle();
    }

    @Provides
    @IntoSet
    Vehicle getTruck() {
        return new Truck();
    }
}
