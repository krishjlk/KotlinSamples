package com.kk.kotlinsamples

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    val age = 15
    lateinit var txt_content: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt_content = findViewById(R.id.txt_content)

//        Learnings ...
        arrays()
        printValueOfVariable()
        repeatBlock("I lOVE YOU", 10)
        constAndVal()

    }

    fun arrays(){
        val array:IntArray = intArrayOf(1,2,3,4,5)
        for (index in array.indices){
           val item = array[index]
        }

        for ( (index,value) in array.withIndex()) {

        }
    }

    fun constAndVal() {
        val test: String = printValueOfVariable()
    }

    fun printValueOfVariable(): String {
        txt_content.text = "My Age is ${age} years"
        return "ad"
    }

    fun repeatBlock(text: String, count: Int) {
        repeat(count) {
            txt_content.append(text)
        }

    }

    companion object {
        const val test = "Asd"
//        const val test1 = getvalue()

        fun getvalue(): String {
            return "r"
        }
    }

    object Uitls {

        @JvmStatic
        fun getUtils() {

        }
    }

}