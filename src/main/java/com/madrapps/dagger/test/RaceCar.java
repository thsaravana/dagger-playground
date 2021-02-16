package com.madrapps.dagger.test;

import com.madrapps.dagger.models.Cycle;
import com.madrapps.dagger.scopes.Primary;
import com.madrapps.dagger.scopes.Secondary;

import javax.inject.Inject;
import javax.inject.Qualifier;
import javax.inject.Singleton;
import java.io.IOException;

@Singleton
public class RaceCar {

    @Primary
    @Secondary
    @Inject
    public Cycle cycle;

    @Inject
    RaceCar() {
    }

    @Primary
    @Secondary
    @Inject
    public void method() {

    }
}