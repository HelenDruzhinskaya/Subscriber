package ru.myitacademy.samsung.subscriber

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
     //   Toast.makeText(context,intent.action,Toast.LENGTH_SHORT).show()
    if (intent.getBooleanExtra("state",false))
            startActivity(context,Intent(context,SimpleClicker::class.java),null)
        else
        Toast.makeText(context,
            "Работайте, пожалуйста!",
          Toast.LENGTH_SHORT).show()
    }
}
class My2Receiver: BroadcastReceiver(){
    override fun onReceive(p0: Context?, p1: Intent?) {
        Toast.makeText(p0,
            (p1 as Intent).getStringExtra("text"),
            Toast.LENGTH_SHORT).show()
    }

}