package com.madrapps.dagger.multibindings.intomap.qualifier;

import com.madrapps.dagger.models.Vehicle;
import com.madrapps.dagger.multibindings.GreenQualifier;
import com.madrapps.dagger.multibindings.RedQualifier;

import javax.inject.Inject;
import java.util.Map;

public class SideRoad {

    public final Map<String, Vehicle> green;
    public final Map<String, Vehicle> red;

    @Inject
    SideRoad(@GreenQualifier Map<String, Vehicle> green, @RedQualifier Map<String, Vehicle> red) {
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
