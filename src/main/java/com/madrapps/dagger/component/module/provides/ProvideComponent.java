package com.madrapps.dagger.component.module.provides;

import com.madrapps.dagger.component.models.MudTrail;
import dagger.Component;

@Component(modules = ProvideModule.class)
public interface ProvideComponent {

    MudTrail mudTrail();
}
