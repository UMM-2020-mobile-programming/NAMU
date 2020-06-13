package com.alfianr.namu_napaktilasmuhammadiyah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_success.*

class SuccessActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success)

        btn_home.setOnClickListener{
            val intent = Intent(this@SuccessActivity,
                HomeActivity::class.java)
            finishAffinity()
            startActivity(intent)
        }
    }
}
