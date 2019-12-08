package com.a.a.a;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

import com.tencent.bugly.crashreport.CrashReport;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();


        CrashReport.UserStrategy strategy = new CrashReport.UserStrategy(this);

        strategy.setAppChannel("test");  //
        strategy.setAppVersion(getAppName(this));      //App的版本
        strategy.setAppPackageName(getPackageName());  //App的包名
        CrashReport.initCrashReport(this, "", true, strategy);


    }


    /**
     * 获取应用程序名称
     */
    public static synchronized String getAppName(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(
                    context.getPackageName(), 0);
            int labelRes = packageInfo.applicationInfo.labelRes;
            return context.getResources().getString(labelRes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
 }
