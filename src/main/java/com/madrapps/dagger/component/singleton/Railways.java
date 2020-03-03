package com.madrapps.dagger.component.singleton;

import com.madrapps.dagger.component.models.Road;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Railways implements Road {

    @Inject
    Railways() {}
}
