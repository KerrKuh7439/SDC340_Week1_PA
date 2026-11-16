package com.example.kerrikuhnke_contactsaddressbook

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

//Kerri Kuhnke
//PA - Contacts Address Book Application
//15 November 2026

class HermioneGrangerContactPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hermione_granger_contact_page)

        val backButton = findViewById<Button>(R.id.btn_BackHG)
        backButton.setOnClickListener {
            finish()
        }
    }
}