package ru.myitacademy.samsung.subscriber

import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    val receiver=MyReceiver()
    val receiver2 = My2Receiver()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//  1. //
registerReceiver(receiver,IntentFilter("android.intent.action.AIRPLANE_MODE"))
//registerReceiver(receiver,IntentFilter("android.net.wifi.WIFI_STATE_CHANGED"))
 registerReceiver(receiver2, IntentFilter("Козьма_Прутков"))
        }

    override fun onDestroy() {
        super.onDestroy()
//  1.  //
unregisterReceiver(receiver)
    }

    override fun onStart() {
        super.onStart()
        //2.  //   registerReceiver(receiver, IntentFilter("android.intent.action.AIRPLANE_MODE"))
    }

    override fun onStop() {
        super.onStop()
     //2.  //   unregisterReceiver(receiver)
    }

    override fun onResume() {
        super.onResume()
        //3.  //   registerReceiver(receiver, IntentFilter("android.intent.action.AIRPLANE_MODE"))
    }

    override fun onPause() {
        super.onPause()
        //3. //    unregisterReceiver(receiver)
    }
}