package com.leader.automax.bi

import android.graphics.Bitmap
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.leader.automax.bi.helper.CustomLoadingPb


class IncidentsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_incidents)

        val ivBack = findViewById<ImageView>(R.id.iv_back)
        ivBack.setOnClickListener { onBackPressed() }

        val webView = findViewById<WebView>(R.id.wv_incidents)
        webView.settings.javaScriptEnabled = true

        val customLoadingPb = CustomLoadingPb(this)
        webView.webViewClient = object : WebViewClient() {
            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)
                customLoadingPb.show()
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                customLoadingPb.dismiss()
            }
        }

        webView.loadUrl("https://www.webpagetest.org/")
    }
}