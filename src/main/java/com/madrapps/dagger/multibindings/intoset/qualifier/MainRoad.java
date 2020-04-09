package com.madrapps.dagger.multibindings.intoset.qualifier;

import com.madrapps.dagger.models.Vehicle;
import com.madrapps.dagger.multibindings.GreenQualifier;
import com.madrapps.dagger.multibindings.RedQualifier;

import javax.inject.Inject;
import java.util.Set;

public class MainRoad {

    public final Set<Vehicle> green;
    public final Set<Vehicle> red;

    @Inject
    MainRoad(@GreenQualifier Set<Vehicle> green, @RedQualifier Set<Vehicle> red) {
        this.green = green;
        this.red = red;
    }

    @Override
    public String toString() {
        return "MainRoad{" +
                "green=" + green +
                ", red=" + red +
                '}';
    }
}
