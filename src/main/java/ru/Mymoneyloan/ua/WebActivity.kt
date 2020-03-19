package ru.Mymoneyloan.ua

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient

class WebActivity : AppCompatActivity() {

    lateinit var web_view:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        val url = intent.getStringExtra(INTENT_URL)
        web_view = findViewById(R.id.web_view)
        web_view.settings.javaScriptEnabled = true
//        web_view.webViewClient = object : WebViewClient() {
//            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
//                view?.loadUrl(url)
//                return true
//            }
//        }
//        web_view.loadUrl(url)
        web_view.webViewClient = WebViewClient()
        web_view.loadUrl(url)
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK && web_view.canGoBack()) {
            web_view.goBack()
            return true
        }
        return super.onKeyDown(keyCode, event)
    }

    class MyWebViewClient:WebViewClient(){
        override fun shouldOverrideUrlLoading(
            view: WebView?,
            request: WebResourceRequest?
        ): Boolean {
            view?.loadUrl(request?.url.toString())
            return true
        }

        override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
            view.loadUrl(url)
            return true
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
        }

    }
}
