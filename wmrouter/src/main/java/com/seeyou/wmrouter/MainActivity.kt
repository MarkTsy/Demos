package com.seeyou.wmrouter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.sankuai.waimai.router.Router
import com.sankuai.waimai.router.common.DefaultUriRequest

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        val defaultUriRequest = DefaultUriRequest(baseContext, "/test")
        defaultUriRequest.setIntentFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        Router.startUri(defaultUriRequest)
    }
}