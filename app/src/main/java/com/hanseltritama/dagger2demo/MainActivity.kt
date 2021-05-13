package com.hanseltritama.dagger2demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component: CarComponent = DaggerCarComponent.create()
        car = component.getCar()
        car.drive()
    }
}