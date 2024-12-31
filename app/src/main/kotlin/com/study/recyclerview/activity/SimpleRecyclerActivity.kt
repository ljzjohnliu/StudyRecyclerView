package com.study.recyclerview.activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.study.recyclerview.R
import com.study.recyclerview.adapter.SimpleRecyAdapter
import com.study.recyclerview.bean.RecyConstantsBean
import com.study.recyclerview.databinding.ActivitySimpleBinding

@SuppressLint("CustomSplashScreen")
class SimpleRecyclerActivity : ComponentActivity() {
    val TAG = ""
    var mainInitList = mutableListOf<RecyConstantsBean>();
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySimpleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.testTv.text = "I am just test!"

        mainInitList.add(RecyConstantsBean(R.mipmap.avatar, "测试员1"))
        mainInitList.add(RecyConstantsBean(R.mipmap.avatar2, "测试员2"))
        mainInitList.add(RecyConstantsBean(R.mipmap.avatar3, "测试员3"))
        mainInitList.add(RecyConstantsBean(R.mipmap.avatar4, "测试员4"))
        mainInitList.add(RecyConstantsBean(R.mipmap.avatar5, "测试员5"))
        val someRecyAdapter = SimpleRecyAdapter(mainInitList)//获取适配器 适配器传入数据
//        binding.recyMainInit.layoutManager = LinearLayoutManager(this)
        binding.recyMainInit.layoutManager = GridLayoutManager(this, 4)
        binding.recyMainInit.adapter = someRecyAdapter//设置RecyclerView的适配器
        someRecyAdapter.itemClickListener = {
            //列表点击的接口回调
            Log.d(TAG, "itemClickListener:")
        }
    }
}