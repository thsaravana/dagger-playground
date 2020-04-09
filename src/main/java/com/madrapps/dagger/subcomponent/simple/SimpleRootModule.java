package com.madrapps.dagger.subcomponent.simple;

import com.madrapps.dagger.models.Cycle;
import com.madrapps.dagger.models.Vehicle;
import dagger.Module;
import dagger.Provides;

@Module
public class SimpleRootModule {

    @Provides
    public Cycle getCycle() {
        return new Cycle();
    }
}
