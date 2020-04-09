package com.madrapps.dagger.subcomponent.direct;

import com.madrapps.dagger.models.MudTrail;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;

@Subcomponent
public interface EmptySubComponent {

    MudTrail trail();
}
