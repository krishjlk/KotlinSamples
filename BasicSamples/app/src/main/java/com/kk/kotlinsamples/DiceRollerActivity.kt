package com.kk.kotlinsamples

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class DiceRollerActivity : AppCompatActivity() {

    lateinit var img_dice: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice_roller)
        img_dice = findViewById(R.id.img_dice)
    }

    fun rollDice(v: View?) {

        val face = Dice(6).roll()
        when (face) {
            1 -> img_dice.setImageResource(R.drawable.diceone)
            2 -> img_dice.setImageResource(R.drawable.dicetwo)
            3 -> img_dice.setImageResource(R.drawable.dicethree)
            4 -> img_dice.setImageResource(R.drawable.dicefour)
            5 -> img_dice.setImageResource(R.drawable.dicefive)
            6 -> img_dice.setImageResource(R.drawable.dicesix)
        }

    }

    class Dice(val faces: Int) {
        fun roll(): Int {
            val face = 1..faces
            return face.random()
        }
    }
}