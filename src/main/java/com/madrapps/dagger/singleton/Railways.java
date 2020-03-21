package com.madrapps.dagger.singleton;

import com.madrapps.dagger.models.Road;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Railways implements Road {

    @Inject
    Railways() {}
}
