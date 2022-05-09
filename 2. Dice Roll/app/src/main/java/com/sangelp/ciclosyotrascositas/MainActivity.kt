package com.sangelp.ciclosyotrascositas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val myFirstDice = Dice()
        println("Your ${myFirstDice.numSides} sided dice rolled ${myFirstDice.roll()}")
        var luckyNumber = myFirstDice.generateLuckyNumber()
        val rollButton: Button = findViewById(R.id.button3)
        rollButton.setOnClickListener {
            val roll = myFirstDice.roll()

            val resultTextView: TextView = findViewById(R.id.textView5)
            resultTextView.text = roll.toString()

            if (roll == luckyNumber){
                val toast = Toast.makeText(this, "Dice Rolled - Encontraste el número ganador", Toast.LENGTH_LONG)
                toast.show()
                luckyNumber = myFirstDice.generateLuckyNumber()
            }else{
                val toast = Toast.makeText(this, "Dice Rolled - Sigue intentando", Toast.LENGTH_LONG)
                toast.show()
            }

        }

    }
}