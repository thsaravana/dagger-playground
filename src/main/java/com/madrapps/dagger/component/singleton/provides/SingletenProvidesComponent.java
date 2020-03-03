package com.madrapps.dagger.component.singleton.provides;

import com.madrapps.dagger.component.models.Truck;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = SingletenProvidesModule.class)
public interface SingletenProvidesComponent {

    Truck truck();
}
