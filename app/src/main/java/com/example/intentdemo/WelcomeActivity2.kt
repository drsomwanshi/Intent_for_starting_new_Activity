package com.example.intentdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class WelcomeActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome2)

        var b:Bundle?=intent.extras
        var name=b?.getString("name");

        var txt2=findViewById(R.id.txt2) as TextView
        txt2.setText("Welcome "+name)
    }
}