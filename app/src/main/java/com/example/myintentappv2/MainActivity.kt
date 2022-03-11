package com.example.myintentappv2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnPindahActivity: Button
    private lateinit var btnPindahActivityWithData: Button
    private lateinit var btnPindahActivityWithObject: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPindahActivity = findViewById(R.id.btn_pindah_activity)
        btnPindahActivityWithData = findViewById(R.id.btn_pindah_activity_data)
        btnPindahActivityWithObject = findViewById(R.id.btn_pindah_activity_object)

        btnPindahActivity.setOnClickListener(this)
        btnPindahActivityWithData.setOnClickListener(this)
        btnPindahActivityWithObject.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_pindah_activity -> {
                val pindahIntent = Intent(this@MainActivity, PindahActivity::class.java)
                startActivity(pindahIntent)
            }
            R.id.btn_pindah_activity_data -> {
                val pindahIntentWithData = Intent(this@MainActivity, PindahWithDataActivity::class.java)
                pindahIntentWithData.putExtra(PindahWithDataActivity.EXTRA_NAME, "Yayan Rahmat Wijaya")
                pindahIntentWithData.putExtra(PindahWithDataActivity.EXTRA_AGE, 25)
                startActivity(pindahIntentWithData)
            }
            R.id.btn_pindah_activity_object -> {
                val person = Person(
                    "DicodingAcademy",
                    5,
                    "academy@dicoding.com",
                    "Bandung"
                )

                val pindahIntentWithObject = Intent(this@MainActivity, MoveWithObjectActivity::class.java)
                pindahIntentWithObject.putExtra(MoveWithObjectActivity.EXTRA_PERSON, person)
                startActivity(pindahIntentWithObject)
            }
        }
    }
}