package com.seeyou.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BaiduRequest {
    @GET(".")
    Call<String> getBaiduString();
}
