package com.mi.hybrid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView wv = findViewById(R.id.wv);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.addJavascriptInterface(this, "injectedObject");
        wv.loadUrl("file:///android_asset/index.html");
    }

    private long startTime;

    @JavascriptInterface
    public void start() {
        Log.e("hybridhybridhybrid", "start");
        startTime = System.currentTimeMillis();
    }

    @JavascriptInterface
    public void sendString(String str) {
        Log.e("hybridhybridhybrid", "sendString");
    }

    @JavascriptInterface
    public void sendBytes(byte[] bytes) {
        Log.e("hybridhybridhybrid", "sendBytes");
    }

    @JavascriptInterface
    public void end() {
        Log.e("hybridhybridhybrid", "end time : " + (System.currentTimeMillis() - startTime));
    }
}