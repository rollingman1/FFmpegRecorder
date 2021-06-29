package com.github.crazyorr.ffmpegrecorder.util;

import android.os.Handler;
import android.os.Message;

public class Messenger {
    Handler mHandler;
    public Messenger(Handler handler){
        this.mHandler = handler;
    }
    public void sendMessage(int i){
        Message msg;
        switch (i){
            case 1:
                msg = Message.obtain(mHandler, 1, "Motion Detected");
                mHandler.sendMessage(msg);
                break;
            case 2:
                msg = Message.obtain(mHandler, 2, "Motion Ended");
                mHandler.sendMessage(msg);
                break;
            case 3:
                msg = Message.obtain(mHandler, 3, "Detector Deleted");
                mHandler.sendMessage(msg);
                break;
        }
    }
}
