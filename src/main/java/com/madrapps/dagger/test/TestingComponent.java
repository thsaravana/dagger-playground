package com.madrapps.dagger.test;

import dagger.Component;

@Component(modules = {TestingProvidesModule.class, TestingBindsModule.class})
public interface TestingComponent {

    SuperCar car();
}
