package com.madrapps.dagger.component.di;

import com.madrapps.dagger.component.models.Highways;
import dagger.Component;

@Component
public interface DependentComponent {

    Highways highways();
}
