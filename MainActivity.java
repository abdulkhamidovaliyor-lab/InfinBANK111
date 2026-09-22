package com.infinbank.app;
import android.app.*;import android.os.*;import android.webkit.*;import android.view.*;import android.content.*;import android.net.Uri;
public class MainActivity extends Activity {
 WebView w;
 @Override public void onCreate(Bundle b){super.onCreate(b); getWindow().setStatusBarColor(0xffffffff); getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR); w=new WebView(this); setContentView(w); WebSettings s=w.getSettings();s.setJavaScriptEnabled(true);s.setDomStorageEnabled(true);s.setAllowFileAccess(true); w.setWebViewClient(new WebViewClient()); w.loadUrl("file:///android_asset/index.html");}
 @Override public void onBackPressed(){ if(w.canGoBack()) w.goBack(); else super.onBackPressed(); }
}
