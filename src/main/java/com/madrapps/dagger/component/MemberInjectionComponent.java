package com.madrapps.dagger.component;

import com.madrapps.dagger.models.Street;
import dagger.Component;

@Component
public interface MemberInjectionComponent {

    Street inject(Street street);
}
