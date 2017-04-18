package com.xiaomeiw.resume.whattodo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by wenxiaomei on 17/4/17.
 */

public class AlarmReciever extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "alarm!", Toast.LENGTH_LONG).show();
    }
}
