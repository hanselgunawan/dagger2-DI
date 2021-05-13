package com.hanseltritama.dagger2demo

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(var engine: Engine, var wheels: Wheels) {

    fun drive() {
        Log.d("CAR", "Driving...")
    }
}