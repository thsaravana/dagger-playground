package com.madrapps.dagger.component.module.binds;

import com.madrapps.dagger.component.models.MudTrail;
import dagger.Component;

@Component(modules = BindModule.class)
public interface BindComponent {
    MudTrail mudTrail();
}
