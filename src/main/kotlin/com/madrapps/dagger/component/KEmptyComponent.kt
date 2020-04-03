package com.madrapps.dagger.component

import dagger.Component

@Component
interface KEmptyComponent {

    @Component
    interface KSomeComponent {

    }
}

@Component
interface KAnotherComponent {

}