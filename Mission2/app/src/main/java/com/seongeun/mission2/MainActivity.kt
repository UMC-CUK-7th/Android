package com.seongeun.mission2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.FragmentTransaction
import com.seongeun.mission2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().replace(R.id.main_frame_layout, HomeFragment()).commitAllowingStateLoss()

        binding.mainBotttomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.tab_category -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frame_layout, CategoryFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }

                R.id.tab_snap -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frame_layout, SnapFragment()).commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }

                R.id.tab_home -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frame_layout, HomeFragment()).commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }

                R.id.tab_like -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frame_layout, LikeFragment()).commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }

                R.id.tab_my -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frame_layout, MyFragment()).commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }

                else -> {
                    false
                }
            }
        }
    }
}
