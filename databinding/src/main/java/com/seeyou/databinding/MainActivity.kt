package com.seeyou.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import com.seeyou.databinding.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.viewModel = Person("Mark", 18)

    }

    override fun onClick(v: View?) {
        Log.i("loglog", "onclick")
        var person = binding.viewModel
        person!!.name = person.name + 1
        binding.viewModel = person
    }


}