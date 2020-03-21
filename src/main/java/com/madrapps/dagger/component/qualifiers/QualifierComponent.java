package com.madrapps.dagger.component.qualifiers;

import com.madrapps.dagger.component.models.Road;
import dagger.Component;

@Component(modules = QualifierModule.class)
public interface QualifierComponent {

    Road mountainRoad();
}
