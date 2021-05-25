package com.praja.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.praja.diceapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        diceRoll()

        binding.button.setOnClickListener {
            diceRoll()
        }
    }

    fun diceRoll(){
        val dice = Dice(6)
        val roll = dice.roll()

        val drawableImage = when(roll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        binding.imageView.setImageResource(drawableImage)
    }
}