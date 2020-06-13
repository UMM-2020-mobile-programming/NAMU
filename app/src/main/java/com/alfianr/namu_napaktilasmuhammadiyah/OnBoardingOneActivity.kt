package com.alfianr.namu_napaktilasmuhammadiyah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_on_boarding_one.*

class OnBoardingOneActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding_one)

    btn_home.setOnClickListener{
        val intent = Intent(this@OnBoardingOneActivity,
        OnBoardingTwoActivity::class.java)
        startActivity(intent)
    }

    btn_daftar.setOnClickListener{
         val intent = Intent(this@OnBoardingOneActivity,
         SignInActivity::class.java)
         startActivity(intent)
     }



    }
}
