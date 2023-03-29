package com.example.miercoles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Eneloki : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.eneloki)
    }
    fun volverLoki(@Suppress("UNUSED_PARAMETER")view: View){
        val intent=Intent(this, Loki::class.java).apply { }
            startActivity(intent)
    }
}