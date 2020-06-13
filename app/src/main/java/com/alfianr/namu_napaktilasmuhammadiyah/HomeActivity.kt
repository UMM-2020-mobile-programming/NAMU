package com.alfianr.namu_napaktilasmuhammadiyah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btn_sengkaling.setOnClickListener{
            val intent = Intent(this@HomeActivity,
                DetailTwoActivity::class.java)
            startActivity(intent)
        }
        btn_jodipan.setOnClickListener{
            val intent = Intent(this@HomeActivity,
                DetailActivity::class.java)
            startActivity(intent)
        }


    }
}
