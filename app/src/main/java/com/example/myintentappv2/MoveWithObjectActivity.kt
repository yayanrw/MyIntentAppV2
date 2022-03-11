package com.example.myintentappv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MoveWithObjectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_object)

        val tvObjectReceived: TextView = findViewById(R.id.tv_object_received)

        val person = intent.getParcelableExtra<Person>(EXTRA_PERSON) as Person
        val text = "Name: ${person.name.toString()}, \nEmail: ${person.email.toString()}, \nAge: ${person.age.toString()}, \nCity: ${person.city.toString()}"
        tvObjectReceived.text = text
    }

    companion object {
        const val EXTRA_PERSON = "extra_person"
    }
}