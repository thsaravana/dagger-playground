package com.madrapps.dagger.multibindings.intoset.qualifier;

import com.madrapps.dagger.models.Vehicle;
import dagger.Component;

import java.util.Set;

@Component(modules = IntoSetQualifierModule.class)
public interface IntoSetQualifierComponent {

    @RedQualifier
    Set<Vehicle> redVehicles();

    @GreenQualifier
    Set<Vehicle> greenVehicles();
}
