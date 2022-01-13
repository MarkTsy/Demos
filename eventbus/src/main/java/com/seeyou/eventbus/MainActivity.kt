package com.seeyou.eventbus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import org.greenrobot.eventbus.EventBus

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun one(view: View) {
        EventBus.getDefault().post(MessageEvent("1"))
    }
    fun two(view: View) {
        EventBus.getDefault().post(MessageEvent("2"))
    }
    fun three(view: View) {
        EventBus.getDefault().post(MessageEvent("3"))
    }
}