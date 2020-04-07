package com.madrapps.dagger.models;

import javax.inject.Inject;
import java.util.Set;

public class Riverside implements Road {

    public final Set<Vehicle> vehicles;
    public final Vehicle vehicle;

    @Inject
    Riverside(Set<Vehicle> vehicles, Truck truck) {
        this.vehicles = vehicles;
        vehicle = truck;
    }
}
