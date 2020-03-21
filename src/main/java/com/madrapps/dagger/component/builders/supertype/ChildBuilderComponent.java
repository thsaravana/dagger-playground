package com.madrapps.dagger.component.builders.supertype;

import dagger.Component;

@Component
public abstract class ChildBuilderComponent implements BuilderComponent {

    @Component.Builder
    interface Builder {
        BuilderComponent build();
    }
}
