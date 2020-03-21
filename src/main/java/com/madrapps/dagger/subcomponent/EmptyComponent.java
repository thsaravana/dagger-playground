package com.madrapps.dagger.subcomponent;

import dagger.Component;

@Component(modules = SampleModule.class)
public interface EmptyComponent {

    EmptySubComponent component();
}