package com.madrapps.dagger.module.binds;

import com.madrapps.dagger.models.MudTrail;
import dagger.Component;

@Component(modules = BindModule.class)
public interface BindComponent {
    MudTrail mudTrail();
}
