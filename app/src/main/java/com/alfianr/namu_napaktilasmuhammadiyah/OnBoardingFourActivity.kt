package com.alfianr.namu_napaktilasmuhammadiyah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_on_boarding_four.*

class OnBoardingFourActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding_four)

        btn_home.setOnClickListener{
            finishAffinity()
            val intent = Intent(this@OnBoardingFourActivity,
                SignInActivity::class.java)
            startActivity(intent)
        }
    }
}
