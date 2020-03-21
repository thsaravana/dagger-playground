package com.madrapps.dagger.module.provides;

import com.madrapps.dagger.models.MudTrail;
import dagger.Component;

@Component(modules = ProvideModule.class)
public interface ProvideComponent {

    MudTrail mudTrail();
}
