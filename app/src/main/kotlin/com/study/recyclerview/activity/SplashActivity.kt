package com.study.recyclerview.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import com.study.recyclerview.databinding.ActivitySplashBinding
import com.study.recyclerview.utils.ViewUtil

@SuppressLint("CustomSplashScreen")
class SplashActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.testTv.text = "I am just test!"
        Log.d("TAG", "onCreate: 100dp is " + ViewUtil.dp2px2(this, 100f))
        binding.simpleTest.setOnClickListener {
            Log.d("TAG", "onCreate: simpleTest click!!")
            startActivity(Intent(this, SimpleRecyclerActivity::class.java))
        }
        binding.middleTest.setOnClickListener {
            Log.d("TAG", "onCreate: middleTest click!!")
            startActivity(Intent(this, MainActivity::class.java))
        }
        binding.docShow.setOnClickListener {
            Log.d("TAG", "onCreate: docShow click!!")
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}