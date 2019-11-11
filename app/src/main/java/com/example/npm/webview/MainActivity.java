//package com.example.npm.webview;
//
//import android.app.AlertDialog;
//import android.content.Context;
//import android.content.Intent;
//import android.content.SharedPreferences;
//import android.graphics.Bitmap;
//import android.net.ConnectivityManager;
//import android.net.NetworkInfo;
//import android.net.Uri;
//import android.os.Build;
//import android.os.SystemClock;
//import android.provider.Settings;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.text.TextUtils;
//import android.util.Log;
//import android.view.KeyEvent;
//import android.view.View;
//import android.view.ViewGroup;
//import android.webkit.WebChromeClient;
//import android.webkit.WebSettings;
//import android.webkit.WebView;
//import android.webkit.WebViewClient;
//import android.widget.LinearLayout;
//import android.widget.RelativeLayout;
//import android.widget.Toast;
//
//import com.google.gson.Gson;
//import com.just.agentweb.AgentWeb;
//import com.just.agentweb.DefaultWebClient;
//import com.zhy.http.okhttp.OkHttpUtils;
//import com.zhy.http.okhttp.callback.Callback;
//import com.zhy.http.okhttp.callback.StringCallback;
//
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;
//
//import java.io.UnsupportedEncodingException;
//import java.net.NetworkInterface;
//import java.security.KeyFactory;
//import java.security.NoSuchAlgorithmException;
//import java.security.PrivateKey;
//import java.security.interfaces.RSAPrivateKey;
//import java.security.spec.InvalidKeySpecException;
//import java.security.spec.PKCS8EncodedKeySpec;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Enumeration;
//import java.util.HashMap;
//import java.util.List;
//
//import javax.crypto.Cipher;
//import javax.crypto.SecretKey;
//import javax.crypto.SecretKeyFactory;
//import javax.crypto.spec.DESKeySpec;
//import javax.crypto.spec.IvParameterSpec;
//
//import okhttp3.Call;
//import okhttp3.Request;
//
//import static android.content.ContentValues.TAG;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setTheme(R.style.Theme_AppCompat_Light_NoActionBar);
//        setContentView(R.layout.activity_main);
//
//        RelativeLayout ll = findViewById(R.id.ll);
//        RelativeLayout parent = findViewById(R.id.parent);
//        RelativeLayout.LayoutParams rlp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
//        rlp.setMargins(0, 0, 0, 0);
//
//        parent.setLayoutParams(rlp);
//        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
//        mAgentWeb = AgentWeb.with(this)
//                .setAgentWebParent(ll, lp)
//                .useDefaultIndicator(-1, 0)
//                .setWebViewClient(mWebViewClient)
//                .setWebChromeClient(mWebChromeClient)
//                .setSecurityType(AgentWeb.SecurityType.STRICT_CHECK)
////                .setMainFrameErrorView(com.lsh.packagelibrary.R.layout.agentweb_error_page, -1)
//                .setOpenOtherPageWays(DefaultWebClient.OpenOtherPageWays.ASK)
//                .interceptUnkownUrl()
//                .createAgentWeb()
//                .ready()
//                .go(getUrl());
//        cordWebView = mAgentWeb.getWebCreator().getWebView();
//        mAgentWeb.getWebCreator().getWebView().getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
////      清缓存和记录，缓存引起的白屏
//        cordWebView.clearCache(true);
//        cordWebView.clearHistory();
////      mWebView.setInitialScale(50);
//        cordWebView.requestFocus();
//        cordWebView.getSettings().setDatabaseEnabled(true);
//
//
//        cordWebView.getSettings().setUseWideViewPort(true);
//        cordWebView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
//        cordWebView.getSettings().setLoadWithOverviewMode(true);
//
//
//        /** 获得系统级联网管理员对象 */
//        ConnectivityManager manager = (ConnectivityManager) this
//                .getSystemService(CONNECTIVITY_SERVICE);
//        NetworkInfo info = manager.getActiveNetworkInfo();
//
//        if (info == null) { // 无网情况下
//            // 跳转到网络设置页面
//            Toast.makeText(MainActivity.this, "网络连接失败请设置网络连接", Toast.LENGTH_LONG).show();
//            Intent intent =  new Intent(Settings.ACTION_DATA_ROAMING_SETTINGS);
//            startActivity(intent);
//        }
//
//
////        aa();
//
//    }
//
//
//
//
//}
