package com.madrapps.dagger.component.qualifiers;

import com.madrapps.dagger.component.models.Road;
import com.madrapps.dagger.component.models.Vehicle;

public class MountainRoad implements Road {

    private final Vehicle one;
    private final Vehicle two;

    public MountainRoad(Vehicle one, Vehicle two) {
        this.one = one;
        this.two = two;
        System.out.printf("One = %s and Two = %s\n", one, two);
    }
}
