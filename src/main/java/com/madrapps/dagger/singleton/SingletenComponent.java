package com.madrapps.dagger.singleton;

import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component
public interface SingletenComponent {

    Railways railways();
}
