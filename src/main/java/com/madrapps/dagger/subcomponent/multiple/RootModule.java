package com.madrapps.dagger.subcomponent.multiple;

import com.madrapps.dagger.models.Cycle;
import com.madrapps.dagger.models.Train;
import dagger.Module;
import dagger.Provides;

@Module
public class RootModule {

    @Provides
    Train getTrain() {
        return new Train();
    }
}
