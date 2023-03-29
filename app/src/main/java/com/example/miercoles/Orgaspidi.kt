package com.example.miercoles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Orgaspidi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.orgaspidi)
    }
    fun volverSpidi(@Suppress("UNUSED_PARAMETER")view: View){
        val intent= Intent(this, Spidi::class.java).apply { }
            startActivity(intent)
    }
}