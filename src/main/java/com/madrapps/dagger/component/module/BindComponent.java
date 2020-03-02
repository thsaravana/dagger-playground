package com.madrapps.dagger.component.module;

import com.madrapps.dagger.component.models.MudTrail;
import dagger.Component;

@Component(modules = BindModule.class)
public interface BindComponent {
    MudTrail mudTrail();
}
