package com.madrapps.dagger.multibindings.intomap.boxedkeys.enums;

import dagger.MapKey;

@MapKey
public @interface VehicleTypeKey {
    VehicleType value();
}
