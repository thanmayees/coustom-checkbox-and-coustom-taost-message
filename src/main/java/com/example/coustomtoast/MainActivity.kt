package com.example.coustomtoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val b1 = findViewById<Button>(R.id.button)
        b1.setOnClickListener {
            val ctoastlayout =
                layoutInflater.inflate(R.layout.coustomtoast,findViewById(R.id.customcontainer))
            val customToast = Toast(this)
            customToast.view = ctoastlayout
            customToast.setGravity(Gravity.CENTER,0,0)
            customToast.duration = Toast.LENGTH_LONG
            customToast.show()
        }
    }
}