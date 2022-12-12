package com.kk.kotlinsamples

import org.junit.Test

class DiceTest {

    @Test
    fun diceRollTestCase1(){
        val faces = 6
        if(faces != 6){
            assert(false)
        }

        val dice = DiceRollerActivity.Dice(faces).roll()
        if(dice <1 || dice>6){
           assert(false)
        }
        else {
            assert(true)
        }
    }
}