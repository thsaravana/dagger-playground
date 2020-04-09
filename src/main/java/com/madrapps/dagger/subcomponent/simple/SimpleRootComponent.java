package com.madrapps.dagger.subcomponent.simple;

import com.madrapps.dagger.models.Cycle;
import dagger.Component;

@Component(modules = {SimpleSubComponent.InstallSubComponentModule.class, SimpleRootModule.class})
public interface SimpleRootComponent {

    Cycle obtainVehicle();

    SeaWays seaways();
}
