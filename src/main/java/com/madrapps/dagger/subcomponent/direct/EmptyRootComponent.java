package com.madrapps.dagger.subcomponent.direct;

import dagger.Component;

@Component(modules = SampleModule.class)
public interface EmptyRootComponent {

    EmptySubComponent component();
}