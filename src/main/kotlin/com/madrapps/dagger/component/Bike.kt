package com.madrapps.dagger.component

import com.madrapps.dagger.models.Car
import com.madrapps.dagger.models.Cycle
import com.madrapps.dagger.models.Vehicle
import com.madrapps.dagger.scopes.Primary
import dagger.Component
import javax.inject.Inject
import javax.inject.Singleton

@Primary
class Bike @Inject constructor() : Vehicle {

    @JvmField
    @Inject
    var car: Car? = null

    @Inject
    fun method(car: Car) {
    }
}

@Primary
class MotorBike {

    @Inject
    constructor()

    @Inject
    lateinit var car: Car

    @Inject
    lateinit var cycle: Cycle
}

@Component
interface Comp {

    fun inject(bike: MotorBike)
}

// TOP LEVEL private classes are not really private
private class MudBike {

    @Inject
    constructor() {

    }
}

@Singleton
class CasualBike @Inject constructor() {

}