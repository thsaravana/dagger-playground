package com.madrapps.dagger.component.qualifiers;

import com.madrapps.dagger.component.models.Cycle;
import com.madrapps.dagger.component.models.Road;
import com.madrapps.dagger.component.models.Truck;
import com.madrapps.dagger.component.models.Vehicle;
import dagger.Module;
import dagger.Provides;

@Module
public class QualifierModule {

    @Provides
    static Road mountainRoad(@Red Vehicle one, @Green Vehicle two) {
        return new MountainRoad(one, two);
    }

    @Provides
    @Red
    static Vehicle red() {
        return new Truck();
    }

    @Provides
    @Red
    static Truck truck() {
        return new Truck();
    }

    @Provides
    @Green
    static Vehicle green() {
        return new Cycle();
    }
}
