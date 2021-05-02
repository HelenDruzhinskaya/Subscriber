package ru.myitacademy.samsung.subscriber

import android.Manifest
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    val receiver=MyReceiver()
    val receiver2 = My2Receiver()
       override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
     //  1. регистрируем приёмник в методе onCreate()
           val intentFilter = IntentFilter("android.intent.action.AIRPLANE_MODE")
registerReceiver(receiver,intentFilter)

           /* приёмник для упражнения 4.6.2
           registerReceiver(receiver,IntentFilter("android.net.wifi.WIFI_STATE_CHANGED"))
            */
           /* приёмник для упражнения 4.6.3
 registerReceiver(receiver2, IntentFilter("Козьма_Прутков"))
*/
           /* приёмник  для тестирования упражнений 4.7, в разделе 4.6 не используется
           registerReceiver(receiver, IntentFilter("ru.myitacademy.samsung.advertising.POST"))
            */
       }

  /* 1.   override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(receiver)
    }*/

    /*2. override fun onStart() {
        super.onStart()
        registerReceiver(receiver, IntentFilter("android.intent.action.AIRPLANE_MODE"))
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(receiver)
    }*/

    /* 3. override fun onResume() {
        super.onResume()
        registerReceiver(receiver, IntentFilter("android.intent.action.AIRPLANE_MODE"))
    }

    override fun onPause() {
        super.onPause()
        unregisterReceiver(receiver)
    }*/
}