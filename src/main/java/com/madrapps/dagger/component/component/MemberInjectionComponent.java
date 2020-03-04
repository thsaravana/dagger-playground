package com.madrapps.dagger.component.component;

import com.madrapps.dagger.component.models.Street;
import dagger.Component;

@Component
public interface MemberInjectionComponent {

    Street inject(Street street);
}
