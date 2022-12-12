package com.kk.kotlinsamples

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class FunctionsActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val test = getData()
        val i = 10;
        i.square(3)

    }

    fun add(a:Int, b:Int) : Int {
        return a + b
    }

    val add = fun(a:Int,b:Int):Int {
        val c= a + 2
        val d = b+4
        return c+d;
    }

    fun add10(number:Int):Int {
        return number + 10;
    }

    val add10 : (Int) -> Int = {
       number -> number + 10
    }

    val print: (Unit) -> Unit = {
         print("tst")
        print("ad")
    }

    val convert : (Int,String) -> Int = {
        number,date -> print(number)
        print(date)
        4
    }

    val test_no_params : () -> Unit = {
        print("test")
    }

    val test1_no_params = {print("ad")}

    val test_param_no_return : (Int,Int) -> Unit = {
        it1,it2 ->
        print(it1*it2)
    }

    val test1_param_no_return: (Int, Int) -> Int = {
        a: Int, b: Int -> print("test")
        a
    }

    val square : Int.(Int) -> Int = {
        it -> it * it
    }


    val product = { a: Int, b: Int -> a * b }


    class Test : LocationUtils.Data(1) {

        override fun test1(): Int {
            return super.test1()
        }
    }

//    // Kotlin Program For better understanding of launch
//    fun GFG()
//    {
//        var resultOne = "Android"
//        var resultTwo = "Kotlin"
//        Log.i("Launch", "Before")
//        launch(Dispatchers.IO) { resultOne = function1() }
//        launch(Dispatchers.IO) { resultTwo = function2() }
//        Log.i("Launch", "After")
//        val resultText = resultOne + resultTwo
//        Log.i("Launch", resultText)
//    }
//
//    suspend fun function1(): String
//    {
//        delay(1000L)
//        val message = "function1"
//        Log.i("Launch", message)
//        return message
//    }
//
//    suspend fun function2(): String
//    {
//        delay(100L)
//        val message = "function2"
//        Log.i("Launch", message)
//        return message
//    }

}