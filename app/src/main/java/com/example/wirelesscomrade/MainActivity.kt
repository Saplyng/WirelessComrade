package com.example.wirelesscomrade

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        fun woodPrice(number: Int){
            if (number > 1){
                idTextOutput.text = "$" + (1.9 * 12 * number).toString() + " per year. Thank you for your business!"
            }
            else if (number == 1){
                idTextOutput.text = "$" + (2 *12).toString() + " per year. Thank you for your business!"
            }
        }

        fun stonePrice(number: Int){
            if (number > 1){
                idTextOutput.text = "$" + (9 * 12 * number).toString() + " per year. Thank you for your business!"
            }
            else if (number == 1){
                idTextOutput.text = "$" + (10 *12).toString() + " per year. Thank you for your business!"
            }
        }

        fun sheepPrice(number: Int){
            if (number > 1){
                idTextOutput.text = "$" + (13.5 * 12 * number).toString() + " per year. Thank you for your business!"
            }
            else if (number == 1){
                idTextOutput.text = "$" + (15 *12).toString() + " per year. Thank you for your business!"
            }
        }

        idButton.setOnClickListener{
            var numberInput = idNumber.text.toString().toInt()
            when (idNumber.text != null){
                idRadioWood.isChecked -> woodPrice(numberInput)
                idRadioStone.isChecked -> stonePrice(numberInput)
                idRadioSheep.isChecked -> sheepPrice(numberInput)
            }
        }

    }
}
