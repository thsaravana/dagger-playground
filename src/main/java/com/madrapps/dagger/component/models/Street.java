package com.madrapps.dagger.component.models;

import javax.inject.Inject;

public class Street implements Road {

    @Inject
    Truck truck;

    @Inject
    public Car car;
}
