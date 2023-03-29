package com.example.miercoles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Loki : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loki)
    }
    fun volver(@Suppress("UNUSED_PARAMETER")view:View ){
        val intent= Intent(this, MainActivity::class.java).apply { }
            startActivity(intent)
    }
    fun eneloki(@Suppress("UNUSED_PARAMETER")view: View){
        val intent= Intent(this, Eneloki::class.java).apply { }
            startActivity(intent)
    }
    fun orgaloki(@Suppress("UNUSED_PARAMETER")view: View){
        val intent= Intent(this, Orgaloki::class.java).apply { }
            startActivity(intent)
    }
}