package com.gmail.diahp748.menumakanan

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    var dataArray = arrayOf("Bakso","Pecel Ayam","Pecel Lele","Mie Ayam")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_acak.setOnClickListener{
            val random = Random()
            val randomProgram = random.nextInt(dataArray.count())
            hasil.text = dataArray[randomProgram]
        }
    }
}
