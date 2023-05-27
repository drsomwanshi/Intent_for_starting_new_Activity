package com.example.intentdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun open(view: View) {

        var name="";
        var txt1=findViewById(R.id.txt1) as EditText
        name=txt1.text.toString();
        var intent=Intent(this,WelcomeActivity2::class.java);
        intent.putExtra("name",name)
        startActivity(intent)

    }
}