package com.example.tttatown

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            // on below line we are
            // creating a new intent
            val i = Intent(
                this,
                MainActivity::class.java

            )
            startActivity(i)
            finish()
        },2000)
    }
}