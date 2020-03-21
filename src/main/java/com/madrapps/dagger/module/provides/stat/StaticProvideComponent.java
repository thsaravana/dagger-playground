package com.madrapps.dagger.module.provides.stat;

import com.madrapps.dagger.models.MudTrail;
import dagger.Component;

@Component(modules = StaticProvideModule.class)
public interface StaticProvideComponent {

    MudTrail mudTrail();
}
