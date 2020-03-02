package com.madrapps.dagger.component.multibindings.intomap.provides.stat;

import com.madrapps.dagger.component.models.Alley;
import dagger.Component;

@Component(modules = IntoMapStaticProvidesModule.class)
public interface IntoMapStaticProvidesComponent {

    Alley alley();
}
