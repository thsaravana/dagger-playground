package com.madrapps.dagger.multibindings.intoset.multimodule;

import com.madrapps.dagger.models.Alley;
import com.madrapps.dagger.models.Riverside;
import dagger.Component;

@Component(modules = {IntoSetBindsModule.class, IntoSetProvidesModule.class})
public interface IntoSetMultiModuleComponent {

    Riverside riverside();
}
