package com.sangelp.timetipapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sangelp.timetipapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    // Variable de nivel superor para la clase del objeto de vinculación.
    // lateinit --> Promesa de que el código va a iniciar la variable antes de usuarla.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // inicializando objeto binding, para acceder a los views del diseño
        setContentView(binding.root)
        binding.calculateButton.setOnClickListener{
            val tipAmount = calculateTip()
            binding.tipResult.setText("Tip Amount: $"+tipAmount.toString())
        }
    }

    fun calculateTip() : Double{
        val costService = binding.costServiceEditText.text.toString().toDouble()
        val selectedId = binding.tipOptions.checkedRadioButtonId
        val percentage = when(selectedId){
            R.id.option_20_percent -> 0.20
            R.id.option_18_percent -> 0.18
            else -> 0.15
        }
        val roundTip = binding.roundUpSwitch.isChecked
        var tip = if(roundTip) Math.ceil(percentage * costService) else percentage * costService
        return tip
    }

    // Ejemplo
    // Old way with findViewById()
    // val myButton: Button = findViewById(R.id.my_button)
    // myButton.text = "A button"
    //
    // Better way with view binding
    // val myButton: Button = binding.myButton
    // myButton.text = "A button"
    //
    // Best way with view binding and no extra variable
    // binding.myButton.text = "A button"
}