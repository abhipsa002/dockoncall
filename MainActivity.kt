package com.example.doctor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {



        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            // get reference to button
            val btn_click_me = findViewById(R.id.btn_click_me) as Button
            // set on-click listener
            btn_click_me.setOnClickListener {
                // your code to perform when the user clicks on the button
                Toast.makeText(this@MainActivity, "You clicked to proceed without emergency.", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, LoginActivity::class.java)
                // start your next activity
                startActivity(intent)
            }
        }
    }

