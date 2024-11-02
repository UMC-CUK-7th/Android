package com.example.mission5_memo

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mission5_memo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var memo: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        binding.btnMain.setOnClickListener {
            var intent = Intent(this, CheckActivity::class.java)
            intent.putExtra("data", binding.edtMain.text.toString())
            startActivity(intent)
        }

    }

    override fun onStop() {
        super.onStop()
        memo = binding.edtMain.text.toString()
        binding.edtMain.text.clear()

    }

    override fun onPause() {
        super.onPause()
        memo = binding.edtMain.text.toString()
    }

    override fun onResume() {
        super.onResume()
        if (memo.isNotEmpty()) {
            binding.edtMain.setText(memo)
        }
    }

    override fun onRestart() {
        super.onRestart()
        AlertDialog.Builder(this)
            .setMessage("이어서 작성?")
            .setPositiveButton("예") { dialog, which ->
                binding.edtMain.setText(memo)
            }
            .setNegativeButton("아니요") { dialog, which ->
                binding.edtMain.text.clear()
            }
            .create()
            .show()
    }
}
