package com.example.inshorts_you;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CustomWebView extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}
