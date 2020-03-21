package com.madrapps.dagger.multibindings.intomap.multimodule;

import com.madrapps.dagger.models.Alley;
import dagger.Component;

@Component(modules = {IntoMapBindsModule.class, IntoMapProvidesModule.class})
public interface IntoMapMultiModuleComponent {

    Alley alley();
}
