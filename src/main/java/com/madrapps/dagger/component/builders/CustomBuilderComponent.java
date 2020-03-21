package com.madrapps.dagger.component.builders;

import com.madrapps.dagger.models.Train;
import com.madrapps.dagger.models.Truck;
import com.madrapps.dagger.models.Vehicle;
import dagger.BindsInstance;
import dagger.Component;

@Component(dependencies = DependentComponent.class, modules = DependentModule.class)
public interface CustomBuilderComponent {

    Vehicle vehicle();
    Truck truck();

    @Component.Builder
    interface Builder {
        CustomBuilderComponent build();

        Builder setDependentComponent(DependentComponent component);
        void setDependentModule(DependentModule module);

        Builder setVehicle(@BindsInstance Vehicle vehicle);

        @BindsInstance
        Builder setTrain(Train train);
    }
}
