package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash) // 스플래시 화면 레이아웃 설정

        // 스플래시 화면 전체 레이아웃을 찾기
        val splashLayout: RelativeLayout = findViewById(R.id.splash_layout)

        // 페이드 인 애니메이션 적용 (내장된 android.R.anim.fade_in 사용)
        val fadeInAnimation = AnimationUtils.loadAnimation(this, android.R.anim.fade_in)
        splashLayout.startAnimation(fadeInAnimation)

        // 3초 후에 메인 액티비티로 이동 (페이드 아웃 애니메이션 포함)
        Handler(Looper.getMainLooper()).postDelayed({
            // 페이드 아웃 애니메이션 적용 (내장된 android.R.anim.fade_out 사용)
            val fadeOutAnimation = AnimationUtils.loadAnimation(this, android.R.anim.fade_out)
            splashLayout.startAnimation(fadeOutAnimation)

            // 페이드 아웃 애니메이션이 끝난 후 MainActivity로 전환
            Handler(Looper.getMainLooper()).postDelayed({
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish() // 스플래시 액티비티 종료
            }, fadeOutAnimation.duration)

        }, 3000) // 3초 동안 스플래시 화면 표시
    }
}
