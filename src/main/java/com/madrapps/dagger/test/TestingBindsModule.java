package com.madrapps.dagger.test;

import com.madrapps.dagger.models.Car;
import com.madrapps.dagger.models.Vehicle;
import dagger.Binds;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;

import java.util.Set;

@Module
public abstract class TestingBindsModule {

    @Binds
    abstract Vehicle getCar(Car car);
}
