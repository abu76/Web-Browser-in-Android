package com.a.rayhanstricks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView webapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webapp =findViewById(R.id.myapp);
        webapp.getSettings().setJavaScriptEnabled(true);
        webapp.loadUrl("https://aburayhanar.blogspot.com/");

    }
}