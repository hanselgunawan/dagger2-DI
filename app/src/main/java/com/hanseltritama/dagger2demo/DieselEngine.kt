package com.hanseltritama.dagger2demo

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor() : Engine {

    override fun start() {
        Log.d("CAR", "Diesel Engine Started")
    }
}