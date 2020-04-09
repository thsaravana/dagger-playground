package com.madrapps.dagger.multibindings.intomap.qualifier;

import com.madrapps.dagger.models.Cycle;
import com.madrapps.dagger.models.Train;
import com.madrapps.dagger.models.Truck;
import com.madrapps.dagger.models.Vehicle;
import com.madrapps.dagger.multibindings.GreenQualifier;
import com.madrapps.dagger.multibindings.RedQualifier;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module
public class IntoMapQualifierModule {

    @RedQualifier
    @Provides
    @IntoMap
    @StringKey("One")
    public Vehicle truck() {
        return new Truck();
    }

    @RedQualifier
    @Provides
    @IntoMap
    @StringKey("Two")
    public Vehicle train() {
        return new Train();
    }

    @GreenQualifier
    @Provides
    @IntoMap
    @StringKey("Three")
    public Vehicle cycle() {
        return new Cycle();
    }
}
