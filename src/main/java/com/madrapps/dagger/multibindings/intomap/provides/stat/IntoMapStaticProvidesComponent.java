package com.madrapps.dagger.multibindings.intomap.provides.stat;

import com.madrapps.dagger.models.Alley;
import dagger.Component;

@Component(modules = IntoMapStaticProvidesModule.class)
public interface IntoMapStaticProvidesComponent {

    Alley alley();
}
