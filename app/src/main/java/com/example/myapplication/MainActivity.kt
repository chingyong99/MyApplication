package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //onCreate = main()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Create the UI
        //R = resources
        setContentView(R.layout.activity_main)
        //TODO Continue your work here
        //val = value , var = variable
        val buttonHelloWorld : Button = findViewById(R.id.buttonHelloWorld)
        val buttonReset : Button = findViewById(R.id.buttonReset)

        buttonHelloWorld.setOnClickListener{ showMessage() }
        buttonReset.setOnClickListener{ showReset() }
    }


    private fun showMessage() {
        val textViewMessage : TextView = findViewById(R.id.textViewMessage)
        textViewMessage.setText("Hello <Kai Dog>")
    }

    private fun showReset() {
        val textViewMessage : TextView = findViewById(R.id.textViewMessage)
        textViewMessage.setText(getString(R.string.hello))
    }



}
