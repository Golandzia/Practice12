package com.example.practice12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun clickAppleRadioButton(view: View){
        val imageFruit : ImageView = findViewById(R.id.imageOfFruit)
        imageFruit.setImageResource(R.drawable.apple)
        val radioButtonOther1 : RadioButton = findViewById(R.id.GrapeRadioButton)
        val radioButtonOther2 :RadioButton = findViewById(R.id.PearRadioButton)
        radioButtonOther1.isChecked = false
        radioButtonOther2.isChecked = false
    }
    fun clickPearRadioButton(view: View){
        val imageFruit : ImageView = findViewById(R.id.imageOfFruit)
        imageFruit.setImageResource(R.drawable.pear)
        val radioButtonOther1 : RadioButton = findViewById(R.id.AppleRadioButton)
        val radioButtonOther2 :RadioButton = findViewById(R.id.GrapeRadioButton)
        radioButtonOther1.isChecked = false
        radioButtonOther2.isChecked = false
    }
    fun clickGrapeRadioButton(view: View){
        val imageFruit : ImageView = findViewById(R.id.imageOfFruit)
        imageFruit.setImageResource(R.drawable.grape)
        val radioButtonOther1 : RadioButton = findViewById(R.id.AppleRadioButton)
        val radioButtonOther2 :RadioButton = findViewById(R.id.PearRadioButton)
        radioButtonOther1.isChecked = false
        radioButtonOther2.isChecked = false
    }
    fun clickAppleCheckBox(view: View){
        val checkBox :CheckBox = findViewById(R.id.AppleCheckBox)
        val imageFruit :ImageView = findViewById(R.id.AppleImageView)
        if(checkBox.isChecked){
            imageFruit.setImageResource(R.drawable.apple)
        }
        else{
            imageFruit.setImageResource(0)
        }
    }
    fun clickPearCheckBox(view: View){
        val checkBox :CheckBox = findViewById(R.id.PearCheckBox)
        val imageFruit :ImageView = findViewById(R.id.PearImageView)
        if(checkBox.isChecked){
            imageFruit.setImageResource(R.drawable.pear)
        }
        else{
            imageFruit.setImageResource(0)
        }
    }
    fun clickGrapeCheckBox(view: View){
        val checkBox :CheckBox = findViewById(R.id.GrapeCheckBox)
        val imageFruit :ImageView = findViewById(R.id.GrapeImageView)
        if(checkBox.isChecked){
            imageFruit.setImageResource(R.drawable.grape)
        }
        else{
            imageFruit.setImageResource(0)
        }
    }
}