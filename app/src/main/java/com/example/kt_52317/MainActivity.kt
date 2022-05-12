package com.example.kt_52317

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.MutableLiveData

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val _data = MutableLiveData<String>()
        val str: String? = null

        if (str != null) {
            _data.value = str // Error (Expected non-nullable value)
            _data.value = str!! // Warning (Unnecessary non-null assertion (!!) on a non-null receiver of type String)
            val str1: String = str // works fine
        }
    }
}