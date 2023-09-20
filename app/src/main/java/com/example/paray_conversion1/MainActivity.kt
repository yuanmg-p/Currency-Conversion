package com.example.paray_conversion1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val but = findViewById<Button>(R.id.idBtn1);

        val text1 = findViewById<EditText>(R.id.phpE);

        val text2 = findViewById<EditText>(R.id.usdE);

        but.setOnClickListener{
            val val1 = text1.text.toString().toInt();


            val total= val1 * .018;

            val toast = Toast.makeText(this, total.toString(), Toast.LENGTH_SHORT) // in Activity
            toast.show()
            text2.setText(total.toString());
        }

    }
}