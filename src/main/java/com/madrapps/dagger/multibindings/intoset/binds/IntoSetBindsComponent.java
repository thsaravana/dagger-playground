package com.madrapps.dagger.multibindings.intoset.binds;

import com.madrapps.dagger.models.Riverside;
import dagger.Component;

@Component(modules = {IntoSetBindsModule.class})
public interface IntoSetBindsComponent {

    Riverside riverside();
}
