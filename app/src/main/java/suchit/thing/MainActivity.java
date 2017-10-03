package suchit.thing;


import android.app.Activity;
import android.os.Bundle;

import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity  {

    private WebView wv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ip_login);
    }

    public void login(View view)
    {
        EditText editText = (EditText) findViewById(R.id.pass);
        String pwd = editText.getText().toString();

        if (pwd.equals("trusted22")) {
            EditText editText2 = (EditText) findViewById(R.id.IP);
            String IP = editText2.getText().toString();
            setContentView(R.layout.activity_main);
            wv1 = (WebView) findViewById(R.id.webView);
            WebSettings ws = wv1.getSettings();
            ws.setJavaScriptEnabled(true);
            wv1.setWebViewClient(new MyBrowser());
            wv1.getSettings().setLoadsImagesAutomatically(true);
            wv1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
            wv1.loadUrl("http://" + IP);
        }
        else if (pwd.equals("V138"))
        {
            setContentView(R.layout.egg);
            TextView tv= (TextView) findViewById(R.id.tvEgg);
            tv.setText("Akshay is best ;*");
        }
        else if (pwd.equals("V141"))
        {
            setContentView(R.layout.egg);
            TextView tv= (TextView) findViewById(R.id.tvEgg);
            tv.setText("Akshay is still best. \n Ishan is also nice.");
        }
        else
            finish();
    }

    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

    public void onBack (View view)
    {
        onBackPressed();
    }

    @Override
    public void onBackPressed() {
        if (wv1.canGoBack()) {
            wv1.goBack();
            return;
        }
    }
}