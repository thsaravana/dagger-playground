package com.madrapps.dagger.qualifiers;

import com.madrapps.dagger.models.Road;
import dagger.Component;

@Component(modules = QualifierModule.class)
public interface QualifierComponent {

    Road mountainRoad();
}
