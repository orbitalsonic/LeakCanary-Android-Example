package com.hypersoft.leakcanary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SampleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample)

        MainActivity.context = this
    }
}