package com.madrapps.dagger.subcomponent.multiple;

import com.madrapps.dagger.models.Cycle;
import com.madrapps.dagger.models.Train;
import com.madrapps.dagger.models.Vehicle;

import javax.inject.Inject;

public class Parent {

    @Inject
    public Parent(MultipleParentSubComponent.Builder builder, Train train) {
        System.out.println(builder.build().getTrain());
        System.out.println(builder.build().getTruck());
    }
}
