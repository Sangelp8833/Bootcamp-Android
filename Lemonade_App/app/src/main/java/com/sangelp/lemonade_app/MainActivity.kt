package com.sangelp.lemonade_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val setViewElements = SetViewElements()
        val stateMachine = StateMachine()


        val mainImageView : ImageView = findViewById(R.id.lemon_tree)


        mainImageView.setOnClickListener {
            var textIndicator = stateMachine.getTextIndicador(stateMachine.count)
            var mainTextView: TextView = findViewById(R.id.textView)

            mainTextView.text = setViewElements.textMaps.get(textIndicator)
            var drawable = setViewElements.drawable.get(textIndicator)
            if (drawable != null) {
                mainImageView.setImageResource(drawable)
            }

            if (stateMachine.count >= 3) {
                stateMachine.count = 0

            } else{
                stateMachine.count += 1
            }
        }
    }

}