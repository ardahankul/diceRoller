package com.example.myapplication

import android.media.Image
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.support.v4.os.HandlerCompat.postDelayed
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import android.os.Looper
import android.util.Log
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Buton tanımlama ve buton ile fonksiyon çağırma
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()


        }

    }




    // Zar atma fonksiyonu
    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceImage : ImageView = findViewById(R.id.imageView)
        diceImage.setImageResource(R.drawable.dice_2)


        //Random sayı üreticisinden return edilen sayıya göre ekrana bastırılacak resmi seçme
        when (diceRoll) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }



    }
}

//Zar class'ı oluşturma
class Dice(val numSides: Int){ //Zarın yüzey sayısını tanımlama


    fun roll(): Int{//Zar class'ına ait zar atma fonksiyonu
        return (1..numSides).random()
    }
}