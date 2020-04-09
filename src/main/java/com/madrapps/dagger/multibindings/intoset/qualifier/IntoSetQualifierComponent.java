package com.madrapps.dagger.multibindings.intoset.qualifier;

import com.madrapps.dagger.models.Vehicle;
import com.madrapps.dagger.multibindings.GreenQualifier;
import com.madrapps.dagger.multibindings.RedQualifier;
import com.madrapps.dagger.multibindings.intomap.qualifier.SideRoad;
import dagger.Component;

import java.util.Set;

@Component(modules = IntoSetQualifierModule.class)
public interface IntoSetQualifierComponent {

    @RedQualifier
    Set<Vehicle> redVehicles();

    @GreenQualifier
    Set<Vehicle> greenVehicles();

    MainRoad mainRoad();
}
