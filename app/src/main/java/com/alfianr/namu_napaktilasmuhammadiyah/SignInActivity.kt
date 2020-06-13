package com.alfianr.namu_napaktilasmuhammadiyah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sign_in.*
import kotlinx.android.synthetic.main.activity_sign_in.btn_home
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        btn_home.setOnClickListener{
            val intent = Intent(this@SignInActivity,
                HomeActivity::class.java)
            startActivity(intent)
        }
        btn_daftar.setOnClickListener{
            val intent = Intent(this@SignInActivity,
                SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}
