package com.madrapps.dagger;

import com.madrapps.dagger.component.*;
import com.madrapps.dagger.models.*;
import com.madrapps.dagger.module.binds.BindComponent;
import com.madrapps.dagger.module.binds.DaggerBindComponent;
import com.madrapps.dagger.module.empty.DaggerEmptyModuleComponent;
import com.madrapps.dagger.module.empty.EmptyModuleComponent;
import com.madrapps.dagger.module.provides.DaggerProvideComponent;
import com.madrapps.dagger.module.provides.ProvideComponent;
import com.madrapps.dagger.module.provides.stat.DaggerStaticProvideComponent;
import com.madrapps.dagger.module.provides.stat.StaticProvideComponent;
import com.madrapps.dagger.multibindings.intomap.binds.DaggerIntoMapBindsComponent;
import com.madrapps.dagger.multibindings.intomap.binds.IntoMapBindsComponent;
import com.madrapps.dagger.multibindings.intomap.multimodule.DaggerIntoMapMultiModuleComponent;
import com.madrapps.dagger.multibindings.intomap.multimodule.IntoMapMultiModuleComponent;
import com.madrapps.dagger.multibindings.intomap.provides.DaggerIntoMapProvidesComponent;
import com.madrapps.dagger.multibindings.intomap.provides.IntoMapProvidesComponent;
import com.madrapps.dagger.multibindings.intomap.provides.stat.DaggerIntoMapStaticProvidesComponent;
import com.madrapps.dagger.multibindings.intomap.provides.stat.IntoMapStaticProvidesComponent;
import com.madrapps.dagger.multibindings.intoset.binds.DaggerIntoSetBindsComponent;
import com.madrapps.dagger.multibindings.intoset.binds.IntoSetBindsComponent;
import com.madrapps.dagger.multibindings.intoset.multimodule.DaggerIntoSetMultiModuleComponent;
import com.madrapps.dagger.multibindings.intoset.multimodule.IntoSetMultiModuleComponent;
import com.madrapps.dagger.multibindings.intoset.provides.DaggerIntoSetProvidesComponent;
import com.madrapps.dagger.multibindings.intoset.provides.IntoSetProvidesComponent;
import com.madrapps.dagger.qualifiers.DaggerQualifierComponent;
import com.madrapps.dagger.qualifiers.QualifierComponent;
import com.madrapps.dagger.singleton.DaggerSingletenComponent;
import com.madrapps.dagger.singleton.Railways;
import com.madrapps.dagger.singleton.SingletenComponent;
import com.madrapps.dagger.singleton.binds.DaggerSingletenBindsComponent;
import com.madrapps.dagger.singleton.binds.SingletenBindsComponent;
import com.madrapps.dagger.singleton.provides.DaggerSingletenProvidesComponent;
import com.madrapps.dagger.singleton.provides.SingletenProvidesComponent;
import com.madrapps.dagger.singleton.provides.stat.DaggerSingletenStaticProvidesComponent;
import com.madrapps.dagger.singleton.provides.stat.SingletenStaticProvidesComponent;

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

        SingletenComponent singletenComponent = DaggerSingletenComponent.create();
        Railways railways1 = singletenComponent.railways();
        Railways railways2 = singletenComponent.railways();
        System.out.println("Is Singleton = " + (railways1 == railways2));

        SingletenProvidesComponent singletenProvidesComponent = DaggerSingletenProvidesComponent.create();
        Truck truck1 = singletenProvidesComponent.truck();
        Truck truck2 = singletenProvidesComponent.truck();
        System.out.println("Is Singleton = " + (truck1 == truck2));

        SingletenStaticProvidesComponent singletenStaticProvidesComponent = DaggerSingletenStaticProvidesComponent.create();
        Truck truck3 = singletenStaticProvidesComponent.truck();
        Truck truck4 = singletenStaticProvidesComponent.truck();
        System.out.println("Is Singleton = " + (truck3 == truck4));

        SingletenBindsComponent singletenBindsComponent = DaggerSingletenBindsComponent.create();
        Vehicle vechicle1 = singletenBindsComponent.vechicle();
        Vehicle vechicle2 = singletenBindsComponent.vechicle();
        System.out.println("Is Singleton = " + (vechicle1 == vechicle2));

        MemberInjectionComponent memberInjectionComponent = DaggerMemberInjectionComponent.create();
        Street street = new Street();
        memberInjectionComponent.inject(street);
        System.out.println("Street Car = " + street.car);

        QualifierComponent qualifierComponent = DaggerQualifierComponent.create();
        Road road = qualifierComponent.mountainRoad();
        System.out.println("Road = " + road);

        IntoSetProvidesComponent intoSetProvidesComponent = DaggerIntoSetProvidesComponent.create();
        Riverside riverside = intoSetProvidesComponent.riverSide();
        System.out.println("Vehicles = " + riverside.vehicles);

        IntoSetBindsComponent intoSetBindsComponent = DaggerIntoSetBindsComponent.create();
        Riverside riverside1 = intoSetBindsComponent.riverside();
        System.out.println("Vehicles = " + riverside1.vehicles);

        IntoSetMultiModuleComponent intoSetMultiModuleComponent = DaggerIntoSetMultiModuleComponent.create();
        Riverside riverside2 = intoSetMultiModuleComponent.riverside();
        System.out.println("Vehicles = " + riverside2.vehicles);

    }
}
