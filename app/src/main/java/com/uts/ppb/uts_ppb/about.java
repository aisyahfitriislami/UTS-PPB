package com.uts.ppb.uts_ppb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by User on 12/11/2017.
 */

public class about extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        WebView browser = (WebView) findViewById(R.id.webkit);
        browser.loadData("" +
                " <html>" +
                "<body>" +
                "<title>About Aplikasi</title>" +
                "<p>Tentang aplikasi" +
                "<br/>" +
                "Aplikasi ini aplikasi tentang pencatatan olahraga" +
                "<br/>" +
                "<br/>" +
                "-------------------------------------------------" +
                "<br/>" +
                "Aplikasi ini dibuat oleh : <br/>" +
                "1406012 - Aisyah Fitri Islami<br/>" +
                "1406065 - Indri Widari<br/>" +
                "<br/>" +
                "-------------------------------------------------" +
                "</p>" +
                "</body>" +
                "</html>", "text/html", "UTF-8");
    }
}
