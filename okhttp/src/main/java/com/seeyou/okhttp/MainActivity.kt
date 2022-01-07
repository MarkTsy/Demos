package com.seeyou.okhttp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import okhttp3.*
import java.io.IOException

class MainActivity : AppCompatActivity() {
    private val TAG = "OkHttp"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val client = OkHttpClient.Builder().build()

        val request = Request.Builder()
            .url("http://www.baidu.com")
            .build()

        val newCall = client.newCall(request)

        newCall.enqueue(object: Callback {
            override fun onFailure(call: Call, e: IOException) {
                Log.e(TAG, "onFailure")
                e.printStackTrace()
            }

            override fun onResponse(call: Call, response: Response) {
                Log.e(TAG, "onResponse : " + response.message)
            }
        })

    }
}