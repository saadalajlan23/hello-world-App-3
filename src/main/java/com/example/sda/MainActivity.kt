package com.example.sda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fun sum(num1: Int, num2: Int): Int {
            return num1 + num2
        }


        var num1 = Random.nextInt(10)
        var num2 = Random.nextInt(10)
        var add = sum(num1, num2)

        println("Hello sum $num1 + $num2 =   $add")
        if (num1 > num2) {
            println("$num1 is bigger than $num2")
        } else if (num1 < num2) {
            println("$num2 is bigger than $num1")

        } else {
            println("$num1 equal $num2")
        }
    }
}