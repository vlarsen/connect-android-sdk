package com.telenor.connect.connectidexample;

import android.app.Application;

import com.telenor.connect.ConnectSdk;

public class ExampleApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ConnectSdk.sdkInitialize(getApplicationContext());
    }
}
