package com.appmobil.apprepair.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.appmobil.apprepair.R
import com.appmobil.apprepair.databinding.ActivityMainBinding
import com.appmobil.apprepair.ui.auth.AppMobilAuth
import com.appmobil.apprepair.ui.auth.AuthActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.buttonLogout.setOnClickListener {
            AppMobilAuth.logout(this ) {
                startActivity(Intent(this, AuthActivity::class.java))
                finish()
            }
        }
    }
}