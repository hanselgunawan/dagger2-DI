package com.hanseltritama.dagger2demo

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(var engine: Engine, var wheels: Wheels) {

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }

    fun drive() {
        engine.start()
        Log.d("CAR", "Driving...")
    }
}