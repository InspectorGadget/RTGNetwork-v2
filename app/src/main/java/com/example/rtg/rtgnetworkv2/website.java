package com.example.rtg.rtgnetworkv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class website extends AppCompatActivity {

    WebView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);

        view = (WebView) findViewById(R.id.view);
        view.loadUrl("https://rtgnetwork.tk");

    }
}
