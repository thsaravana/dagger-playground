package com.madrapps.dagger.models;

import javax.inject.Inject;

public class Street implements Road {

    @Inject
    Truck truck;

    @Inject
    public Car car;

    public Street() {
        System.out.println("Street constructor invoked");
    }

    @Inject
    void something(Car cargo) {
        System.out.println("Something called + " + cargo);
    }
}
