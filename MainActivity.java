package com.obyavka.game;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends Activity {
    private WebView w;

    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        w = new WebView(this);
        WebSettings s = w.getSettings();
        s.setJavaScriptEnabled(true);
        s.setDomStorageEnabled(true);
        setContentView(w);
        w.loadUrl("file:///android_asset/index.html");
    }

    @Override
    public void onBackPressed() {
        if (w.canGoBack()) w.goBack(); else super.onBackPressed();
    }
}
