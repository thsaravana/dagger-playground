package com.madrapps.dagger.multibindings.intomap.boxedkeys;

import com.madrapps.dagger.models.Vehicle;
import com.madrapps.dagger.multibindings.intomap.boxedkeys.enums.MyKey;
import com.madrapps.dagger.multibindings.intomap.boxedkeys.enums.VehicleType;
import dagger.Component;

import java.util.Map;

@Component(modules = {IntoMapBoxedKeyModule.class})
public interface IntoMapBoxedKeyComponent {

    Map<Integer, Vehicle> intVehicles();

    Map<Long, Vehicle> longVehicles();

    Map<Class<?>, Vehicle> classVehicles();

    Map<VehicleType, Vehicle> enumVehicles();

    Map<MyKey, String> myKeyStringMap();

    Map<String, Vehicle> stringVehicles();
}
