package com.nachi.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var currentScoreText=scoreText
        println("aaaaaaasss")
        button1.setOnClickListener{
          //  currentScoreText=currentScoreText+1
         //  print(currentScoreText)

        }
    }
}
