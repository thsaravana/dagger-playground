package com.madrapps.dagger.component.module.provides.stat;

import com.madrapps.dagger.component.models.MudTrail;
import dagger.Component;

@Component(modules = StaticProvideModule.class)
public interface StaticProvideComponent {

    MudTrail mudTrail();
}
