package com.seeyou.wmrouter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sankuai.waimai.router.annotation.RouterUri

@RouterUri(path = ["/test"])
class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
}