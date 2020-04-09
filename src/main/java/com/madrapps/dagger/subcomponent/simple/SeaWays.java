package com.madrapps.dagger.subcomponent.simple;

import com.madrapps.dagger.models.Vehicle;

import javax.inject.Inject;

public class SeaWays {

    @Inject
    public SeaWays(SimpleSubComponent.Builder builder) {
        Vehicle vehicle = builder.build().vehicle();
        System.out.println("SeaWays = " + vehicle);
    }
}
