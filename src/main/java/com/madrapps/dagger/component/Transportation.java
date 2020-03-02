package com.madrapps.dagger.component;

import com.madrapps.dagger.component.di.*;
import com.madrapps.dagger.component.models.Alley;
import com.madrapps.dagger.component.models.Car;
import com.madrapps.dagger.component.models.Highways;
import com.madrapps.dagger.component.models.MudTrail;
import com.madrapps.dagger.component.module.binds.BindComponent;
import com.madrapps.dagger.component.module.binds.DaggerBindComponent;
import com.madrapps.dagger.component.module.empty.DaggerEmptyModuleComponent;
import com.madrapps.dagger.component.module.empty.EmptyModuleComponent;
import com.madrapps.dagger.component.module.provides.DaggerProvideComponent;
import com.madrapps.dagger.component.module.provides.ProvideComponent;
import com.madrapps.dagger.component.module.provides.stat.DaggerStaticProvideComponent;
import com.madrapps.dagger.component.module.provides.stat.StaticProvideComponent;
import com.madrapps.dagger.component.multibindings.intomap.binds.DaggerIntoMapBindsComponent;
import com.madrapps.dagger.component.multibindings.intomap.binds.IntoMapBindsComponent;
import com.madrapps.dagger.component.multibindings.intomap.multimodule.DaggerIntoMapMultiModuleComponent;
import com.madrapps.dagger.component.multibindings.intomap.multimodule.IntoMapMultiModuleComponent;
import com.madrapps.dagger.component.multibindings.intomap.provides.DaggerIntoMapProvidesComponent;
import com.madrapps.dagger.component.multibindings.intomap.provides.IntoMapProvidesComponent;
import com.madrapps.dagger.component.multibindings.intomap.provides.stat.DaggerIntoMapStaticProvidesComponent;
import com.madrapps.dagger.component.multibindings.intomap.provides.stat.IntoMapStaticProvidesComponent;

public class Transportation {

    public static void main(String[] args) {
        EmptyComponent emptyComponent = DaggerEmptyComponent.create();

        SimpleComponent diComponent = DaggerSimpleComponent.create();
        Car car = diComponent.car();

        DependentComponent dependentComponent = DaggerDependentComponent.create();
        Highways highways = dependentComponent.highways();

        BindComponent bindComponent = DaggerBindComponent.create();
        MudTrail mudTrail = bindComponent.mudTrail();

        EmptyModuleComponent emptyModuleComponent = DaggerEmptyModuleComponent.create();

        ProvideComponent provideComponent = DaggerProvideComponent.create();
        MudTrail mudTrail1 = provideComponent.mudTrail();

        StaticProvideComponent staticProvideComponent = DaggerStaticProvideComponent.create();
        MudTrail mudTrail2 = staticProvideComponent.mudTrail();

        IntoMapBindsComponent intoMapComponent = DaggerIntoMapBindsComponent.create();
        Alley alley = intoMapComponent.alley();
        System.out.println(alley.vehicleMap);

        IntoMapProvidesComponent intoMapProvidesComponent = DaggerIntoMapProvidesComponent.create();
        Alley alley1 = intoMapProvidesComponent.alley();
        System.out.println(alley1.vehicleMap);

        IntoMapMultiModuleComponent intoMapMultiModuleComponent = DaggerIntoMapMultiModuleComponent.create();
        Alley alley2 = intoMapMultiModuleComponent.alley();
        System.out.println(alley2.vehicleMap);

        IntoMapStaticProvidesComponent intoMapStaticProvidesComponent = DaggerIntoMapStaticProvidesComponent.create();
        Alley alley3 = intoMapStaticProvidesComponent.alley();
        System.out.println(alley3.vehicleMap);
    }
}
