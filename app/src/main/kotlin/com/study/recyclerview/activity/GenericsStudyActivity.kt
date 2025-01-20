package com.study.recyclerview.activity

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.study.recyclerview.bean.Dog
import com.study.recyclerview.discover.GenericsClass
import com.study.recyclerview.discover.MultiGenericsStudyClass

class GenericsStudyActivity : ComponentActivity() {
    private val TAG = "GenericsStudyActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                GenericsStudy(
                    name = "范型学习",
                    modifier = Modifier.padding(innerPadding)
                )
            }
        }
    }

    @Composable
    fun GenericsStudy(name: String, modifier: Modifier = Modifier) {
        Text(
            text = " $name!",
            modifier = modifier.clickable {
                /*val dog = GenericsClass<Dog>()
                Log.d(TAG, dog.animal.name)*/
                MultiGenericsStudyClass.useGenericsMethods()
            }
        )
    }
}