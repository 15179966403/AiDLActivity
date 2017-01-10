package com.hrc.administrator.aidlactivity;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class MyService extends Service {

    public class IMyServiceImpl extends IMyService.Stub{

        @Override
        public String getValue() throws RemoteException {
            return "通过AIDL传递数据";
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return new IMyServiceImpl();
    }
}
