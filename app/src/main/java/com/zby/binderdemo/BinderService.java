package com.zby.binderdemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class BinderService extends Service {
    private final IBinder mBinder = new com.zby.binderdemo.IBYInterface.Stub() {
        @Override
        public String getUserInfo(String uid) {
            System.out.println(uid);
            return uid.replace("?", "!").replace("吗", "").replace("你", "我");
        }
    };

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }


}
