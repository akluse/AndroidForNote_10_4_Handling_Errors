package com.laicar.androidfornote_10_4_handling_errors

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TextInputLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val til = findViewById<TextInputLayout>(R.id.username)
        til.isErrorEnabled=true
        til.error="You need to enter a name"
    }
}
