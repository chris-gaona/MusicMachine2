package com.teamtreehouse.musicmachine;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by chrisgaona on 12/20/17.
 */

public class NetworkConnectionReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(NetworkConnectionReceiver.class.getSimpleName(), intent.getAction());
    }
}
