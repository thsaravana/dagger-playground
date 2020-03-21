package com.madrapps.dagger.singleton.binds;

import com.madrapps.dagger.models.Vehicle;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = SingletenBindsModule.class)
public interface SingletenBindsComponent {

    Vehicle vechicle();
}
