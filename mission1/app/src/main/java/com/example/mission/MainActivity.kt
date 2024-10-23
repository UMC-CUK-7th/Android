package com.example.mission

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        val image1 = findViewById<ImageView>(R.id.imageView1)
        image1.setOnClickListener {
            Toast.makeText(this, "1번 사진 선택", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Photo1Activity::class.java)
            startActivity(intent)
        }
        val image2 = findViewById<ImageView>(R.id.imageView2)
        image2.setOnClickListener {
            Toast.makeText(this, "2번 사진 선택", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Photo2Activity::class.java)
            startActivity(intent)
        }

        val image3 = findViewById<ImageView>(R.id.imageView3)
        image3.setOnClickListener {
            Toast.makeText(this, "3번 사진 선택", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Photo3Activity::class.java)
            startActivity(intent)
        }

        val image4 = findViewById<ImageView>(R.id.imageView4)
        image4.setOnClickListener {
            Toast.makeText(this, "4번 사진 선택", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Photo4Activity::class.java)
            startActivity(intent)
        }

        val image5 = findViewById<ImageView>(R.id.imageView5)
        image5.setOnClickListener {
            Toast.makeText(this, "5번 사진 선택", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Photo5Activity::class.java)
            startActivity(intent)
        }

    }
}