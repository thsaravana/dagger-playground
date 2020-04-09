package com.madrapps.dagger.multibindings.intomap.qualifier;

import com.madrapps.dagger.models.Vehicle;
import com.madrapps.dagger.multibindings.GreenQualifier;
import com.madrapps.dagger.multibindings.RedQualifier;
import dagger.Component;

import java.util.Map;

@Component(modules = IntoMapQualifierModule.class)
public interface IntoMapQualifierComponent {

    @RedQualifier
    Map<String, Vehicle> redVehicles();

    @GreenQualifier
    Map<String, Vehicle> greenVehicles();

    SideRoad sideRoad();
}
