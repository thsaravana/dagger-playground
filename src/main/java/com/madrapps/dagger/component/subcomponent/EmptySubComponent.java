package com.madrapps.dagger.component.subcomponent;

import com.madrapps.dagger.component.models.MudTrail;
import dagger.Subcomponent;

@Subcomponent
public interface EmptySubComponent {

    MudTrail trail();
//
//    BeachRoad road();

//    @Subcomponent.Factory
//    interface Builder {
//        EmptySubComponent build(@BindsInstance Buggy buggy);
//    }
//
//    @Module(subcomponents = EmptySubComponent.class)
//    interface Something{}
}
