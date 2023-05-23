package com.example.appelis.view.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appelis.databinding.WelcomeScreenActivityBinding
import com.example.appelis.data.network.ApiClient
import com.example.appelis.core.RetrofitHelper
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: WelcomeScreenActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = WelcomeScreenActivityBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnStart.setOnClickListener {
            getInitData()
            val intent = Intent(this, PrincipalActivity::class.java)
            startActivity(intent)
        }

    }

    private fun getInitData() {
        //llamar a retrofit y guardarlo en la database
        RetrofitHelper.getRetrofit().create(ApiClient::class.java)
        

    }


}