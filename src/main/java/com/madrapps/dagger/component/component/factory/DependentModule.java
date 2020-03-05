package com.madrapps.dagger.component.component.factory;

import com.madrapps.dagger.component.models.Car;
import com.madrapps.dagger.component.models.Truck;
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
