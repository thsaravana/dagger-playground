package com.madrapps.dagger.multibindings.elementsintoset.multimodule;

import com.madrapps.dagger.models.Riverside;
import com.madrapps.dagger.models.Vehicle;
import dagger.Component;

import javax.inject.Provider;
import java.util.Set;

@Component(modules = {ElementsIntoSetBindsModule.class, ElementsIntoSetProvidesModule.class})
public interface ElementsIntoSetMultiModuleComponent {

    Riverside riverside();

    Set<Vehicle> vehicles();

    Provider<Set<Vehicle>> providers();
}
