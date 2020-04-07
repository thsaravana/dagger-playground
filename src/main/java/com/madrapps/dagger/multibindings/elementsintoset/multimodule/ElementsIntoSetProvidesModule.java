package com.madrapps.dagger.multibindings.elementsintoset.multimodule;

import com.madrapps.dagger.models.Cycle;
import com.madrapps.dagger.models.Truck;
import com.madrapps.dagger.models.Vehicle;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.ElementsIntoSet;
import dagger.multibindings.IntoSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Module
public class ElementsIntoSetProvidesModule {

    @Provides
    @ElementsIntoSet
    Set<Vehicle> provideTruckAsVehicle() {
        return new HashSet<>(Arrays.asList(new Truck(), new Cycle()));
    }
}
