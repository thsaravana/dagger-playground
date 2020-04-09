package com.madrapps.dagger.multibindings.intomap.boxedkeys.enums;

import dagger.MapKey;

@MapKey(unwrapValue = false)
public @interface MyKey {
    String name();
    Class<?> implementingClass();
    int[] thresholds();
}