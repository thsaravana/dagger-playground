package com.madrapps.dagger.models;

import dagger.multibindings.Multibinds;

import javax.inject.Inject;
import java.util.Map;

public class Alley implements Road {

    public final Map<String, Vehicle> vehicleMap;
    public final Vehicle vehicle;

    @Inject
    Alley(Map<String, Vehicle> vehicleMap, Truck truck) {
        this.vehicleMap = vehicleMap;
        vehicle = truck;
    }
}
