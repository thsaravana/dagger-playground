package com.madrapps.dagger.component;

import com.madrapps.dagger.models.Car;
import dagger.Component;

@Component
public interface SimpleComponent {

    Car car();
}
