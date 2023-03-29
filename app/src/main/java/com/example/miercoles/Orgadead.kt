package com.example.miercoles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Orgadead : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.orgadead)
    }
    fun volverDead(@Suppress("UNUSED_PARAMETER")view: View){
        val intent= Intent(this, Deadpool::class.java).apply { }
            startActivity(intent)
    }
}