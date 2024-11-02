package com.example.mission5_memo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mission5_memo.databinding.ActivityCheckBinding

class CheckActivity : AppCompatActivity() {

    lateinit var binding: ActivityCheckBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCheckBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textCheck.text = intent.getStringExtra("data")
    }
}