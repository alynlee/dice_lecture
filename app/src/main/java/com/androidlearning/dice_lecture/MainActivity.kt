package com.androidlearning.dice_lecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.androidlearning.dice_lecture.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var  binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //1번방식 - findViewById
//        val btn = findViewById<Button>(R.id.testBtnId)
//        btn.setOnClickListener{
//            Toast.makeText(this, "click", Toast.LENGTH_LONG).show()
//        }

        //2번방식 - DataBinding
        val diceImage1 = binding.dice1
        val diceImage2 = binding.dice2

        binding.diceStartBtn.setOnClickListener{
            Toast.makeText(this, "click", Toast.LENGTH_LONG).show()

            val first = Random.nextInt(1,6)
            val second = Random.nextInt(1,6)
//            Log.d("MainActivity", first.toString())
//            Log.d("MainActivity", second.toString())

            if (first == 1) diceImage1.setImageResource(R.drawable.dice_1)
            else if (first == 2) diceImage1.setImageResource(R.drawable.dice_2)
            else if (first == 3) diceImage1.setImageResource(R.drawable.dice_3)
            else if (first == 4) diceImage1.setImageResource(R.drawable.dice_4)
            else if (first == 5) diceImage1.setImageResource(R.drawable.dice_5)
            else diceImage1.setImageResource(R.drawable.dice_6)

            if (second == 1) diceImage2.setImageResource(R.drawable.dice_1)
            else if (second == 2) diceImage2.setImageResource(R.drawable.dice_2)
            else if (second == 3) diceImage2.setImageResource(R.drawable.dice_3)
            else if (second == 4) diceImage2.setImageResource(R.drawable.dice_4)
            else if (second == 5) diceImage2.setImageResource(R.drawable.dice_5)
            else diceImage2.setImageResource(R.drawable.dice_6)

        }
    }
}