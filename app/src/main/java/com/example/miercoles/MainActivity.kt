package com.example.miercoles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.principal)
    }
    fun princi(view: View) {
        setContentView(R.layout.principal)
    }
    fun deadpool(view: View) {
        setContentView(R.layout.deadpool)
    }
    fun spidi(view: View) {
        setContentView(R.layout.spidi)
    }
    fun loki(view: View) {
        setContentView(R.layout.loki)
    }
    fun enemidead(view: View) {
        setContentView(R.layout.enemigodead)
    }
    fun orgadead(view: View) {
        setContentView(R.layout.organizaciondead)
    }
    fun enemispidi(view: View) {
        setContentView(R.layout.enespidi)
    }
    fun orgaspid(view: View) {
        setContentView(R.layout.orgaspidi)
    }
    fun enemiloki(view: View) {
        setContentView(R.layout.eneloki)
    }
    fun orgaloki(view: View) {
        setContentView(R.layout.orgaloki)
    }
}

