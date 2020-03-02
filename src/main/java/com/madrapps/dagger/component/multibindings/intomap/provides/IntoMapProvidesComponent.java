package com.madrapps.dagger.component.multibindings.intomap.provides;

import com.madrapps.dagger.component.models.Alley;
import dagger.Component;

@Component(modules = IntoMapProvidesModule.class)
public interface IntoMapProvidesComponent {

    Alley alley();
}
