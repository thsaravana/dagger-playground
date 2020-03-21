package com.madrapps.dagger.component.subcomponent;

import dagger.Component;

@Component(modules = SampleModule.class)
public interface EmptyComponent {

    EmptySubComponent component();
}