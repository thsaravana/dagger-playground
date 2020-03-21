package com.madrapps.dagger.singleton.provides;

import com.madrapps.dagger.models.Truck;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = SingletenProvidesModule.class)
public interface SingletenProvidesComponent {

    Truck truck();
}
