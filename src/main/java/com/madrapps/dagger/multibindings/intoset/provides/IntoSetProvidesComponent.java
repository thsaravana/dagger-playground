package com.madrapps.dagger.multibindings.intoset.provides;

import com.madrapps.dagger.models.Alley;
import com.madrapps.dagger.models.Riverside;
import com.madrapps.dagger.models.Truck;
import com.madrapps.dagger.models.Vehicle;
import dagger.Component;

@Component(modules = IntoSetProvidesModule.class)
public interface IntoSetProvidesComponent {

    Truck truck();

    Riverside riverSide();
}
