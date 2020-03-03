package com.madrapps.dagger.component.component;

import com.madrapps.dagger.component.models.Highways;
import dagger.Component;

@Component
public interface DependentComponent {

    Highways highways();
}
