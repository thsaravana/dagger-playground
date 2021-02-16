package com.madrapps.dagger.models;

import com.madrapps.dagger.scopes.Primary;

import javax.inject.Inject;
import javax.inject.Singleton;

public class Street implements Road {

    @Primary
    @Singleton
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
