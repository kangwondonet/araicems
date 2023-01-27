package com.example.araicems
import android.webkit.WebViewClient
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var personalKey = intent.getStringExtra("PersonalKey")
        //textView = findViewById(R.id.textView)
        //textView.text = personalKey

        // 추가
        var myWebView: WebView = findViewById(R.id.webview)
        myWebView.webViewClient = WebViewClient()
        myWebView.getSettings().setJavaScriptEnabled(true); // 자바스크립트 사용여부

        myWebView.getSettings().setLoadWithOverviewMode(true);  // WebView 화면크기에 맞추도록 설정 - setUseWideViewPort 와 같이 써야함
        myWebView.getSettings().setUseWideViewPort(true);  // wide viewport 설정 - setLoadWithOverviewMode 와 같이 써야함

        myWebView.getSettings().setSupportZoom(false);  // 줌 설정 여부
        myWebView.getSettings().setBuiltInZoomControls(false);  // 줌 확대/축소 버튼 여부


//        webview.addJavascriptInterface(new AndroidBridge(), "android");
        myWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true); // javascript가 window.open()을 사용할 수 있도록 설정
        myWebView.getSettings().setSupportMultipleWindows(true); // 멀티 윈도우 사용 여부

        myWebView.getSettings().setDomStorageEnabled(true);  // 로컬 스토리지 (localStorage) 사용여부



        myWebView.loadUrl("http://www.unioncorea.com./ara2.php")
    }




}