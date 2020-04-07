package com.madrapps.dagger.multibindings.intomap.boxedkeys;

import com.madrapps.dagger.models.Vehicle;
import dagger.Component;

import java.util.Map;

@Component(modules = {IntoMapBoxedKeyModule.class})
public interface IntoMapBoxedKeyComponent {

    Map<Integer, Vehicle> intVehicles();

    Map<Long, Vehicle> longVehicles();

    Map<Class<?>, Vehicle> classVehicles();
}
