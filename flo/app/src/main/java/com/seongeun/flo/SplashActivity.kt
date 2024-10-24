package com.seongeun.flo

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.seongeun.flo.databinding.ActivitySplashBinding
import com.seongeun.flo.databinding.FragmentStoreBinding

class SplashActivity : AppCompatActivity() {
    lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val handler = Handler(Looper.getMainLooper())

        handler.postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
        },1000)
    }

}