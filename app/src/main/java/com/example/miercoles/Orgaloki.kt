package com.example.miercoles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Orgaloki : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.orgaloki)
    }
    fun volverLoki(@Suppress("UNUSED_PARAMETER")view: View){
        val intent= Intent(this, Loki::class.java).apply { }
            startActivity(intent)
    }
}