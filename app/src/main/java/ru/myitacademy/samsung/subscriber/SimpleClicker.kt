package ru.myitacademy.samsung.subscriber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SimpleClicker : AppCompatActivity() {
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_clicker)
    }
    fun clicker(view: View){
        (view as Button).setText("Нажатий: " + count++)
    }
    fun closed(view:View?){
        finish()
    }
}