package com.madrapps.dagger.component.builders;

import com.madrapps.dagger.component.factory.FactoryComponent;
import com.madrapps.dagger.models.Train;
import com.madrapps.dagger.models.Truck;
import com.madrapps.dagger.models.Vehicle;
import dagger.BindsInstance;
import dagger.Component;

@Component(dependencies = DependentComponent.class, modules = DependentModule.class)
public interface CustomBuilderComponent {

    @Component.Builder
    interface Builder {
        CustomBuilderComponent build();

        Builder setDependentComponent(DependentComponent component);
        void setDependentModule(DependentModule module);
    }
}
