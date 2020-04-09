package com.madrapps.dagger.subcomponent.multiple;

import com.madrapps.dagger.models.Cycle;
import com.madrapps.dagger.models.Train;
import com.madrapps.dagger.models.Vehicle;
import dagger.Module;
import dagger.Subcomponent;

@Subcomponent(modules = MultipleParentModule.class)
public interface MultipleParentSubComponent {

    Train getTrain();
    Vehicle getTruck();

    @Subcomponent.Builder
    interface Builder {
        MultipleParentSubComponent build();
    }

    @Module(subcomponents = MultipleParentSubComponent.class)
    class InstallModule{}

    ChildOneSubComponent childOne();
    ChildTwoSubComponent childTwo();
}
