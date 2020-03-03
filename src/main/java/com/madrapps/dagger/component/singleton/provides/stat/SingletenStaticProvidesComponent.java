package com.madrapps.dagger.component.singleton.provides.stat;

import com.madrapps.dagger.component.models.Truck;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = SingletenStaticProvidesModule.class)
public interface SingletenStaticProvidesComponent {

    Truck truck();
}
