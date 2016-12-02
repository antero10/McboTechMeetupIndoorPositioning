package com.Antero105GmailCom.Mcbotechmeetupbeacon3Gg;

import android.app.Application;

import com.estimote.sdk.EstimoteSDK;

//
// Running into any issues? Drop us an email to: contact@estimote.com
//

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        EstimoteSDK.initialize(getApplicationContext(), "mcbotechmeetupbeacon-3gg", "d64f85e31a381ede80ce2e93bb61e893");

        // uncomment to enable debug-level logging
        // it's usually only a good idea when troubleshooting issues with the Estimote SDK
//        EstimoteSDK.enableDebugLogging(true);
    }
}
