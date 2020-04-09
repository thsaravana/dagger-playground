package com.madrapps.dagger.subcomponent.multiple;

import com.madrapps.dagger.models.Cycle;
import com.madrapps.dagger.models.Train;
import dagger.Component;

@Component(modules = {MultipleParentSubComponent.InstallModule.class, RootModule.class})
public interface MultipleRootComponent {

    Train train();

    Parent getParent();
}
