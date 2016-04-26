package com.example.administrator.broadcastreceiveeeer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Administrator on 4/26/2016.
 */
public class EvilReceiver extends BroadcastReceiver {

    public EvilReceiver() {
        super(); //this SHOULD have it create/run a receiver
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Wouldn't you just love some cookies too?", Toast.LENGTH_LONG).show();
    }
}
