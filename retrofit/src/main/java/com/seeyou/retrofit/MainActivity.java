package com.seeyou.retrofit;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Thread(() -> {

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("http://www.baidu.com/")
                    .addConverterFactory(StringConverterFactory.create())
                    .build();

            BaiduRequest baiduRequest = retrofit.create(BaiduRequest.class);

            BdRequest bdRequest = retrofit.create(BdRequest.class);

            Call<String> bdString = bdRequest.getBdString();
            bdString.enqueue(new Callback<String>() {
                @Override
                public void onResponse(Call<String> call, Response<String> response) {

                }

                @Override
                public void onFailure(Call<String> call, Throwable t) {

                }
            });

            Call<String> baiduString = baiduRequest.getBaiduString();
            baiduString.enqueue(new Callback<String>() {
                @Override
                public void onResponse(Call<String> call, Response<String> response) {
                    Log.e("tsy", "onResponse : " + response.message());
                }

                @Override
                public void onFailure(Call<String> call, Throwable t) {
                    Log.e("tsy", "onFailure");
                }
            });


        }).start();

    }
}
