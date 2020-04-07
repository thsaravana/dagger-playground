package com.madrapps.dagger.multibindings.intoset.qualifier;

import com.madrapps.dagger.models.Cycle;
import com.madrapps.dagger.models.Train;
import com.madrapps.dagger.models.Truck;
import com.madrapps.dagger.models.Vehicle;
import com.madrapps.dagger.subcomponent.Buggy;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;

@Module
public class IntoSetQualifierModule {

    @RedQualifier
    @Provides
    @IntoSet
    public Vehicle truck() {
        return new Truck();
    }

    @RedQualifier
    @Provides
    @IntoSet
    public Vehicle train() {
        return new Train();
    }

    @GreenQualifier
    @Provides
    @IntoSet
    public Vehicle cycle() {
        return new Cycle();
    }
}
