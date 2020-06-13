package com.alfianr.namu_napaktilasmuhammadiyah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_on_boarding_one.*

class OnBoardingTwoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding_two)

        btn_home.setOnClickListener{
            val intent = Intent(this@OnBoardingTwoActivity,
                OnBoardingThreeActivity::class.java)
            startActivity(intent)
        }
    }
}
