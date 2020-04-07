package com.madrapps.dagger.multibindings.intomap.boxedkeys;

import com.madrapps.dagger.models.Cycle;
import com.madrapps.dagger.models.Train;
import com.madrapps.dagger.models.Truck;
import com.madrapps.dagger.models.Vehicle;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.*;

@Module
public class IntoMapBoxedKeyModule {

    @Provides
    @IntoMap
    @IntKey(1)
    Vehicle provide1() {
        return new Truck();
    }

    @Provides
    @IntoMap
    @IntKey(2)
    Vehicle provide2() {
        return new Train();
    }

    @Provides
    @IntoMap
    @LongKey(3)
    Vehicle provide3() {
        return new Train();
    }

    @Provides
    @IntoMap
    @LongKey(4)
    Vehicle provide4() {
        return new Truck();
    }

    @Provides
    @IntoMap
    @ClassKey(Integer.class)
    Vehicle provide5() {
        return new Truck();
    }

    @Provides
    @IntoMap
    @ClassKey(String.class)
    Vehicle provide6() {
        return new Cycle();
    }
}
