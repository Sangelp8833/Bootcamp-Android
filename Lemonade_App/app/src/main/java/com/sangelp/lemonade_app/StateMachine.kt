package com.sangelp.lemonade_app

import android.widget.TextView

class StateMachine(var count : Int = 0) {

    val textMaps = mutableMapOf<Int,String>(0 to "select",
        1 to "squeeze",
        2 to "drink",
        3 to "reStart")


    fun TimesToBeSqueeze() : Int{
        val timesToBeSqueezee = (1..6).random()
        return timesToBeSqueezee
    }

    fun getTextIndicador(indicator : Int) : String?{
        when(indicator){
            0 -> return textMaps.get(indicator)
            1 -> return textMaps.get(indicator)
            2 -> return textMaps.get(indicator)
            else -> return textMaps.get(indicator)
        }
    }


}