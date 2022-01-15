package com.seeyou.wmrouter

import android.app.Application
import com.sankuai.waimai.router.Router
import com.sankuai.waimai.router.common.DefaultRootUriHandler

class MyApp : Application(){

    override fun onCreate() {
        super.onCreate()

        Router.init(DefaultRootUriHandler(this))
    }

}