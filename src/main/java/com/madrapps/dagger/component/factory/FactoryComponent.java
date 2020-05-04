package com.madrapps.dagger.component.factory;

import com.madrapps.dagger.models.Vehicle;
import dagger.BindsInstance;
import dagger.Component;

@Component(dependencies = DependentComponent.class, modules = DependentModule.class)
public interface FactoryComponent {

    Vehicle getVehicle();

    @Component.Factory
    interface MyFactory {
        FactoryComponent build(DependentComponent component, DependentModule module,
                               @BindsInstance Vehicle vehicle);
    }
}