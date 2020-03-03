package com.madrapps.dagger.component.singleton.binds;

import com.madrapps.dagger.component.models.Vehicle;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = SingletenBindsModule.class)
public interface SingletenBindsComponent {

    Vehicle vechicle();
}
