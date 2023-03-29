package com.example.miercoles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Deadpool : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.deadpool)
    }
    fun volver(@Suppress("UNUSED_PARAMETER")view:View ){
        val intent= Intent(this, MainActivity::class.java).apply { }
            startActivity(intent)
    }
    fun enedead(@Suppress("UNUSED_PARAMETER")view:View ){
        val intent= Intent(this, Enedead::class.java).apply { }
            startActivity(intent)
    }
    fun orgadead(@Suppress("UNUSED_PARAMETER")view:View ){
        val intent= Intent(this, Orgadead::class.java).apply { }
            startActivity(intent)
    }
}