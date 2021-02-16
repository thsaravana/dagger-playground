package com.madrapps.dagger.component

import com.madrapps.dagger.models.Truck
import dagger.Component
import dagger.MembersInjector
import dagger.Module
import dagger.Provides

@Component(modules = [KTestModule::class])
interface KEmptyComponent {

    fun truck(): Truck

    @Component
    interface KSomeComponent {

    }
}

@Component
interface KAnotherComponent {

}

@Module
class KTestModule {

    @Provides
    fun car1(): Set<MembersInjector<*>>? {
        return null
    }

}