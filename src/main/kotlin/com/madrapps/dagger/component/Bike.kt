package com.madrapps.dagger.component

import com.madrapps.dagger.models.Car
import com.madrapps.dagger.models.Vehicle
import javax.inject.Inject

class Bike @Inject constructor() : Vehicle {

    @Inject
    lateinit var car: Car

    @Inject
    fun method(car: Car) {

    }
}

class MotorBike : Vehicle {

    @Inject
    constructor()
}