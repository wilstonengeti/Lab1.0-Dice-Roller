package com.example.lab10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random
import kotlin.random.nextInt



class MainActivity : AppCompatActivity() {
    private var randomValue = 1
    private var mShowCount:TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mShowCount = findViewById<TextView>(R.id.show_count)
    }
    fun showToast(view: View){
        Toast.makeText(this, "Hello Toast!",Toast.LENGTH_SHORT).show()
    }

    fun rollingDice(view: View) {
        var randomValues = Random.nextInt(range = 1..6)
        if (mShowCount != null) {
            mShowCount!!.text = randomValues.toString()
        }
    }
}