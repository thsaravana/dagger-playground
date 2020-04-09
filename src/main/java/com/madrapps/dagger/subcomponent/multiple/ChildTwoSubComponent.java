package com.madrapps.dagger.subcomponent.multiple;

import com.madrapps.dagger.models.Car;
import com.madrapps.dagger.models.Cycle;
import dagger.Subcomponent;

@Subcomponent
public interface ChildTwoSubComponent {

    Cycle cycle();
}
