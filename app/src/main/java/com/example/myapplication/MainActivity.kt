package com.example.myapplication

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {
    val arr =ArrayList<Int>()
    fun LargestNumber(){
        var largest = 0
        for(x in arr){
            if(x>largest)
                largest= x}
        textView7.text="$largest"

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        button8.setOnClickListener{
            val UserTest = editText.text.toString().toInt()
            arr.add(UserTest)
        }
        button9.setOnClickListener{
            LargestNumber()
        }

    }


}

