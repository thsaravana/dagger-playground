package com.madrapps.dagger.component.multibindings.intomap.binds;

import com.madrapps.dagger.component.models.Alley;
import dagger.Component;

@Component(modules = {IntoMapBindsModule.class})
public interface IntoMapBindsComponent {

    Alley alley();
}
