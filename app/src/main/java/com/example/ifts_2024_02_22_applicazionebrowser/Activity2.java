package com.example.ifts_2024_02_22_applicazionebrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        //String nome = getIntent().getExtras().getString("Sito");

        String nomeSito = null;
        Bundle b = getIntent().getExtras();

        if (b != null)
            nomeSito = b.getString("Sito");

        EditText et = findViewById(R.id.editText1);
        et.setHint(nomeSito);

        WebView wv = (WebView) findViewById(R.id.webView1);
        wv.getSettings().setJavaScriptEnabled(true);
        // QUESTO SERVE PER NON APRIRE UN BVROWSER A PARTE
        WebViewClient x = new WebViewClient();
        wv.setWebViewClient(x);
        if (nomeSito != null)
            wv.loadUrl(nomeSito);

        Button button1 = (Button) findViewById(R.id.button1);

        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String testo = String.valueOf(et.getText());
                if(testo.length() > 5)
                    wv.loadUrl(testo);

            }
        });



    }




}