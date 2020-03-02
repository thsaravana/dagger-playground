package com.madrapps.dagger.component;

import com.madrapps.dagger.component.di.*;
import com.madrapps.dagger.component.models.Car;
import com.madrapps.dagger.component.models.Highways;
import com.madrapps.dagger.component.models.MudTrail;
import com.madrapps.dagger.component.module.BindComponent;
import com.madrapps.dagger.component.module.DaggerBindComponent;

public class Transportation {

    public static void main(String[] args) {
        EmptyComponent emptyComponent = DaggerEmptyComponent.create();

        SimpleComponent diComponent = DaggerSimpleComponent.create();
        Car car = diComponent.car();

        DependentComponent dependentComponent = DaggerDependentComponent.create();
        Highways highways = dependentComponent.highways();

        BindComponent bindComponent = DaggerBindComponent.create();
        MudTrail mudTrail = bindComponent.mudTrail();
    }
}
