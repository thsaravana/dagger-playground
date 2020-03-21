package com.madrapps.dagger.models;

import javax.inject.Inject;

public class Highways implements Road {

    @Inject
    Highways(Car car1, Car car2) {
    }
}
