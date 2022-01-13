package com.seeyou.retrofit

import retrofit2.Call
import retrofit2.http.GET

interface BdRequest {

    @GET(".")
    fun getBdString() : Call<String>
}