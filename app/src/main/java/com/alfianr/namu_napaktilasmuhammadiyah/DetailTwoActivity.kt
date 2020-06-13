package com.alfianr.namu_napaktilasmuhammadiyah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail_two.*

class DetailTwoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_two)

        btn_home.setOnClickListener{
            val intent = Intent(this@DetailTwoActivity,
                SuccessActivity::class.java)
            finishAffinity()
            startActivity(intent)
        }
    }
}
