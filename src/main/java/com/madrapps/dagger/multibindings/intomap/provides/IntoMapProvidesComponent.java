package com.madrapps.dagger.multibindings.intomap.provides;

import com.madrapps.dagger.models.Alley;
import dagger.Component;

@Component(modules = IntoMapProvidesModule.class)
public interface IntoMapProvidesComponent {

    Alley alley();
}
