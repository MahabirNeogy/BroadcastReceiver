package com.example.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.provider.Settings

class AirplanemodeReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if(intent?.action==Intent.ACTION_AIRPLANE_MODE_CHANGED){
            val isturnedOn= Settings.Global.getInt(context?.contentResolver,Settings.Global.AIRPLANE_MODE_ON) !=0
            println("Is Airplane mode turned on? "+ isturnedOn)
        }
    }
}