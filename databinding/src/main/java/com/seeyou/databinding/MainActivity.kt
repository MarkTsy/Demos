package com.seeyou.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.seeyou.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var viewBinding : ActivityMainBinding
    lateinit var person : Person

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        person = Person("xiaoming", 18)


    }



}