package com.Antero105GmailCom.Mcbotechmeetupbeacon3Gg.estimote;

public interface BeaconContentFactory {

    void getContent(BeaconID beaconID, Callback callback);

    interface Callback {
        void onContentReady(Object content);
    }
}
