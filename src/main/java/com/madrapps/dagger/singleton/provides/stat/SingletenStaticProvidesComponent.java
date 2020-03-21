package com.madrapps.dagger.singleton.provides.stat;

import com.madrapps.dagger.models.Truck;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = SingletenStaticProvidesModule.class)
public interface SingletenStaticProvidesComponent {

    Truck truck();
}
