package com.rpmnetworks.uitset.classes;

import android.app.Application;

import com.smartlook.sdk.smartlook.Smartlook;

public class MyCustomApplication  extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        Smartlook.setupAndStartRecording("9ace3c0c86c0250dce695bbf2228f38b151dd4f2");
    }
}

