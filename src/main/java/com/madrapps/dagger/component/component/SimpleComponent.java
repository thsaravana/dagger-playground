package com.madrapps.dagger.component.component;

import com.madrapps.dagger.component.models.Car;
import dagger.Component;

@Component
public interface SimpleComponent {

    Car car();
}
