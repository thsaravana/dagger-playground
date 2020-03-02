package com.madrapps.dagger.component.models;

import javax.inject.Inject;
import java.util.Map;

public class Alley implements Road {

    public final Map<String, Vehicle> vehicleMap;

    @Inject
    Alley(Map<String, Vehicle> vehicleMap) {
        this.vehicleMap = vehicleMap;
    }
}
