package com.example.myapplication

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.ui.dashboard.DashboardFragment
import com.example.myapplication.ui.home.HomeFragment
import com.example.myapplication.ui.notifications.NotificationsFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        //초기 화면 설정
        if(savedInstanceState == null){
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, HomeFragment())
                .commit()
        }
        //bottom navigation view 아이템 선택 리스너
        navView.setOnItemSelectedListener { item ->
            val selectedFragment: Fragment = when (item.itemId) {
                R.id.navigation_home -> HomeFragment()
                R.id.navigation_dashboard -> DashboardFragment()
                R.id.navigation_notifications -> NotificationsFragment()
                else -> HomeFragment()
            }

            // 프래그먼트 전환 시 애니메이션 효과 추가
            val transaction = supportFragmentManager.beginTransaction()

            when (item.itemId) {
                R.id.navigation_dashboard -> {
                    //슬라이드 효과
                    transaction.setCustomAnimations(
                        android.R.anim.slide_in_left, //새 프래그먼트가 들어올 때 애니메이션
                        android.R.anim.slide_out_right //새 프레크먼트가 나갈 때 애니메이션
                    )
                }

                R.id.navigation_notifications -> {
                    // fade in - out 효과
                    transaction.setCustomAnimations(
                        android.R.anim.fade_in,
                        android.R.anim.fade_out
                    )
                }
                R.id.navigation_home -> {

                }
            }

            //선택한 프레그먼트로 교체
            transaction.replace(R.id.fragment_container, selectedFragment)
            transaction.commit()

            true
        }
    }
}