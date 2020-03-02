package com.madrapps.dagger.component;

import com.madrapps.dagger.component.di.DaggerEmptyComponent;
import com.madrapps.dagger.component.di.DaggerSimpleComponent;
import com.madrapps.dagger.component.di.EmptyComponent;
import com.madrapps.dagger.component.di.SimpleComponent;
import com.madrapps.dagger.component.models.Car;

public class Transportation {

    public static void main(String[] args) {
        EmptyComponent emptyComponent = DaggerEmptyComponent.create();

        SimpleComponent diComponent = DaggerSimpleComponent.create();
        Car car = diComponent.car();
    }
}
