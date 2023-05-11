package com.seeyou.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.seeyou.databinding.databinding.ActivityTestBinding

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val contentView =
            DataBindingUtil.setContentView<ActivityTestBinding>(this, R.layout.activity_test)
//        contentView.person = Person("Mark", 18)
//        contentView.imageUrl = "https://pic.rmb.bdstatic.com/bjh/news/61bb7bd6c21bcc9dd6881e76be117eb9.jpeg"
    }
}