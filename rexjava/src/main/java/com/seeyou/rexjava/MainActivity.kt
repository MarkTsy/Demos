package com.seeyou.rexjava

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.schedulers.Schedulers

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val strs = arrayOf("1", "2", "3")

        Observable.just(strs)
            .observeOn(Schedulers.io())
            .subscribeOn(AndroidSchedulers.mainThread())
            .subscribe(object : Observer<Array<String>>{
                override fun onSubscribe(d: Disposable?) {
                    Log.e("tsy", "onSubscribe")
                }

                override fun onNext(t: Array<String>?) {
                    if (t != null) {
                        for(str in t) {
                            Log.e("tsy", "onNext : $str")
                        }
                    }
                }

                override fun onError(e: Throwable?) {
                    Log.e("tsy", "onError")
                }

                override fun onComplete() {
                    Log.e("tsy", "onComplete")
                }

            })
    }
}