package com.xiaomeiw.resume.whattodo.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

import com.xiaomeiw.resume.whattodo.AlarmReciever;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by wenxiaomei on 17/4/17.
 */

public class AlarmUtils {
    public static void setAlarm(@NonNull Context context, @NonNull Date date) {
        Calendar c = Calendar.getInstance(); // c will contain the current time
        if (date.compareTo(c.getTime()) < 0) { // this statement checks if date is smaller than current time
            // we only fire alarm when date is in the future
            return;
        }

        AlarmManager alarmMgr = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);

        Intent intent = new Intent(context, AlarmReciever.class);
        PendingIntent alarmIntent = PendingIntent.getBroadcast(context,
                0,
                intent,
                PendingIntent.FLAG_UPDATE_CURRENT);
        alarmMgr.set(AlarmManager.RTC_WAKEUP, // will wake up the device
                date.getTime(),
                alarmIntent);
    }
}
