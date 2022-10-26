package com.yusud.kotlinogrenmeprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //If - If else
        println("---------------If - If else---------------")

        val skor = 1

        if(skor < 0){
            println("HATA")
        }else if(skor == 0){
            println("Berbat")
        }else if(skor < 10){
            println("Puanın çok düşük kaybettin.")
        }else if(skor >= 10 && skor < 20){
            println("Puanın iyi ama kaybettin.")
        }else if(skor >= 20 && skor < 30){
            println("Puanın iyi. Tebrikler...")
        }else if(skor >= 30 && skor < 40){
            println("Puanın çok iyi helal olsun..")
        }else{
            println("Rekor Kırdın Maşallah...")
        }


    }
}