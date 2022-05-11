package com.sangelp.lemonade_app

import android.widget.ImageView

class SetViewElements {

    val textMaps = mutableMapOf<String,String>("select" to "Click to select a lemon!",
        "squeeze" to "Click to juice the lemon!",
        "drink" to "Click to drink the lemon",
        "reStart" to "Click to start again!")

    val drawable = mutableMapOf<String, Int>("select" to R.drawable.lemon_tree,
                                                "squeeze" to R.drawable.lemon,
                                                "drink" to R.drawable.lemonade,
                                                "reStart" to R.drawable.empty_glass)
}