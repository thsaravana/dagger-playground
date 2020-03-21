package com.madrapps.dagger.component.factory;

import com.madrapps.dagger.models.Car;
import com.madrapps.dagger.models.Truck;
import dagger.Module;
import dagger.Provides;

@Module
public class DependentModule {

    DependentModule(Car car) {

    }

    @Provides
    Truck truck() {
        return new Truck();
    }

}
