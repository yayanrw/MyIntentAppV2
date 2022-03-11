package com.example.myintentappv2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnPindahActivity: Button
    private lateinit var btnPindahActivityWithData: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPindahActivity = findViewById(R.id.btn_pindah_activity)
        btnPindahActivityWithData = findViewById(R.id.btn_pindah_activity_data)

        btnPindahActivity.setOnClickListener(this)
        btnPindahActivityWithData.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_pindah_activity -> {
                val pindahIntent = Intent(this@MainActivity, PindahActivity::class.java)
                startActivity(pindahIntent)
            }
            R.id.btn_pindah_activity_data -> {
                val pindahIntent = Intent(this@MainActivity, PindahWithDataActivity::class.java)
                pindahIntent.putExtra(PindahWithDataActivity.EXTRA_NAME, "Yayan Rahmat Wijaya")
                pindahIntent.putExtra(PindahWithDataActivity.EXTRA_AGE, 25)
                startActivity(pindahIntent)
            }
        }
    }
}