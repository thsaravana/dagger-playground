package com.madrapps.dagger.subcomponent.multiple;

import com.madrapps.dagger.models.Car;
import dagger.Subcomponent;

@Subcomponent
public interface ChildOneSubComponent {

    Car car();
}
