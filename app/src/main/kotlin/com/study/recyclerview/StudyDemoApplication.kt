package com.study.recyclerview

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.util.Log

class StudyDemoApplication: Application() {
    @SuppressLint("CI_StaticFieldLeak", "StaticFieldLeak")

    companion object{
        protected var sInstance: Context? = null

        fun getInstance(): Context? {
            return sInstance
        }
    }
    val TAG = "StudyDemo"

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "onCreate: ")
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        sInstance = base
        Log.d(TAG, "attachBaseContext: ")
    }
}
