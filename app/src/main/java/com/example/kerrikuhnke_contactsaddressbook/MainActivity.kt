package com.example.kerrikuhnke_contactsaddressbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

//Kerri Kuhnke
//PA - Contacts Address Book Application
//15 November 2026

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Harry Potter Contact Page Button
        val hpButton = findViewById<Button>(R.id.btn_HP)
        hpButton.setOnClickListener {
            startActivity(Intent(this, HarryPotterContactPage::class.java))
        }

        // Hermione Granger Contact Page Button
        val hgButton = findViewById<Button>(R.id.btn_HG)
        hgButton.setOnClickListener {
            startActivity(Intent(this, HermioneGrangerContactPage::class.java))
        }
    }
}