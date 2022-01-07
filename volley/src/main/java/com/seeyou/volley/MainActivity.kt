package com.seeyou.volley

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class MainActivity : AppCompatActivity() {

    private val TAG : String = javaClass.name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Thread {

            val newRequestQueue = Volley.newRequestQueue(this@MainActivity)
            val stringRequest = StringRequest("http://www.baidu.com",
                {
                    Log.e(TAG, it)
                }, {
                    it.printStackTrace()
                })

            newRequestQueue.add(stringRequest)

        }.start()

    }
}