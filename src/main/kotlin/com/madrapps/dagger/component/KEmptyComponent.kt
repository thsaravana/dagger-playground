package com.madrapps.dagger.component

import com.madrapps.dagger.models.Truck
import dagger.Component

@Component
interface KEmptyComponent {

    fun truck(): Truck

    @Component
    interface KSomeComponent {

    }
}

@Component
interface KAnotherComponent {

}