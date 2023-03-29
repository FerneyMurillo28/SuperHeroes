package com.example.miercoles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Spidi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.spidi)
    }
    fun volver(@Suppress("UNUSED_PARAMETER") view:View ){
        val intent= Intent(this, MainActivity::class.java).apply { }
            startActivity(intent)
    }
    fun enespidi(@Suppress("UNUSED_PARAMETER")view: View){
        val intent= Intent(this, Enespidi::class.java).apply { }
            startActivity(intent)
    }
    fun orgaspidi(@Suppress("UNUSED_PARAMETER")view: View){
        val intent= Intent(this, Orgaspidi::class.java).apply { }
            startActivity(intent)
    }
}