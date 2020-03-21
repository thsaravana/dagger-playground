package com.madrapps.dagger.component;

import com.madrapps.dagger.models.Highways;
import dagger.Component;

@Component
public interface DependentComponent {

    Highways highways();
}
