package com.madrapps.dagger.test;

import dagger.Binds;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;

import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

@Module
public class TestingProvidesModule {
//
//    @Provides
//    public Lazy car() {
//        return (Lazy) new SuperCar();
//    }
//
//    @Provides
//    public Lazy<SuperCar> car1() {
//        return (Lazy) new SuperCar();
//    }

    @Provides
    public SuperCar car() {
        return new SuperCar();
    }

    @Provides
    public Set<Lazy<?>> lazyReturn() {
        return null;
    }


//    @Provides
//    public Lazy<SuperCar> car1() {
//        return null;
//    }
}
