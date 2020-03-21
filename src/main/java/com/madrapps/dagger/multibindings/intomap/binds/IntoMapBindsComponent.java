package com.madrapps.dagger.multibindings.intomap.binds;

import com.madrapps.dagger.models.Alley;
import dagger.Component;

@Component(modules = {IntoMapBindsModule.class})
public interface IntoMapBindsComponent {

    Alley alley();
}
