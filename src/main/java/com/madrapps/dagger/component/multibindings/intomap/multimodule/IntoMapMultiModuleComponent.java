package com.madrapps.dagger.component.multibindings.intomap.multimodule;

import com.madrapps.dagger.component.models.Alley;
import dagger.Component;

@Component(modules = {IntoMapBindsModule.class, IntoMapProvidesModule.class})
public interface IntoMapMultiModuleComponent {

    Alley alley();
}
