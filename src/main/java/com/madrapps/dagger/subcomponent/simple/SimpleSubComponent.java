package com.madrapps.dagger.subcomponent.simple;

import com.madrapps.dagger.models.Vehicle;
import dagger.Module;
import dagger.Subcomponent;

@Subcomponent(modules = SimpleSubModule.class)
public interface SimpleSubComponent {

    Vehicle vehicle();

    @Subcomponent.Builder
    interface Builder {
        Builder module(SimpleSubModule module);

        SimpleSubComponent build();
    }

    @Module(subcomponents = SimpleSubComponent.class)
    class InstallSubComponentModule {
    }
}
