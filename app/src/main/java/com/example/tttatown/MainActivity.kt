package com.example.tttatown

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import com.example.tttatown.databinding.ActivityMainBinding
var count = 0
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



var c = 0
       binding.btn1.setOnClickListener {
           if(binding.btn1.text != "X" && binding.btn1.text != "O") {
               if (count == 0) {
                   binding.btn1.setText("X")
                   count = 1

               } else {
                   binding.btn1.setText("O")
                   count = 0
               }


           c++
           }
           result()
       }
        binding.btn2.setOnClickListener {

            if(binding.btn2.text != "X" && binding.btn2.text != "O") {
                if (count == 0) {
                    binding.btn2.setText("X")
                    count = 1
                } else {
                    binding.btn2.setText("O")
                    count = 0
                }
                result()
                c++
            }
        }


        binding.btn3.setOnClickListener {
            if(binding.btn3.text != "X" && binding.btn3.text != "O") {
                if (count == 0) {
                    binding.btn3.setText("X")
                    count = 1
                } else {
                    binding.btn3.setText("O")
                    count = 0
                }
                result()
                c++
            }
        }


        binding.btn4.setOnClickListener {
            if(binding.btn4.text != "X" && binding.btn4.text != "O") {
                if (count == 0) {
                    binding.btn4.setText("X")
                    count = 1
                } else {
                    binding.btn4.setText("O")
                    count = 0
                }
                result()
                c++
            }
        }


        binding.btn5.setOnClickListener {
            if(binding.btn5.text != "X" && binding.btn5.text != "O") {
                if (count == 0) {
                    binding.btn5.setText("X")
                    count = 1
                } else {
                    binding.btn5.setText("O")
                    count = 0
                }
                result()
                c++
            }
        }


        binding.btn6.setOnClickListener {
            if(binding.btn6.text != "X" && binding.btn6.text != "O") {
                if (count == 0) {
                    binding.btn6.setText("X")
                    count = 1
                } else {
                    binding.btn6.setText("O")
                    count = 0
                }
                result()
                c++
            }
        }


        binding.btn7.setOnClickListener {
            if(binding.btn7.text != "X" && binding.btn7.text != "O") {
                if (count == 0) {
                    binding.btn7.setText("X")
                    count = 1
                } else {
                    binding.btn7.setText("O")
                    count = 0
                }
                result()
                c++
            }
        }


        binding.btn8.setOnClickListener {
            if(binding.btn8.text != "X" && binding.btn8.text != "O") {
                if (count == 0) {
                    binding.btn8.setText("X")
                    count = 1
                } else {
                    binding.btn8.setText("O")
                    count = 0
                }
               result()
                c++
            }
        }


        binding.btn9.setOnClickListener {
            if (binding.btn9.text != "X" && binding.btn9.text != "O") {
                if (count == 0) {
                    binding.btn9.setText("X")
                    count = 1
                } else {
                    binding.btn9.setText("O")
                    count = 0
                }
               result()
                c++
            }
        }



    }


    fun ifWin(): Boolean {
        var win = false

        if (binding.btn1.text == binding.btn2.text && binding.btn2.text == binding.btn3.text && (binding.btn1.text == "X" || binding.btn1.text == "O")) {
            win = true
            return win
        }
         if (binding.btn4.text == binding.btn5.text && binding.btn5.text == binding.btn6.text && (binding.btn4.text == "X" || binding.btn4.text == "O")) {
            win = true
             return win
        }
         if (binding.btn7.text == binding.btn8.text && binding.btn7.text == binding.btn9.text && (binding.btn8.text == "X" || binding.btn8.text == "O")) {
            win = true
             return win
         }
         if (binding.btn1.text == binding.btn4.text && binding.btn4.text == binding.btn7.text && (binding.btn4.text == "X" || binding.btn4.text == "O")) {
            win = true
             return win
        }
         if (binding.btn2.text == binding.btn5.text && binding.btn8.text == binding.btn5.text && (binding.btn2.text == "X" || binding.btn2.text == "O")) {
            win = true
             return win
        }
         if (binding.btn3.text == binding.btn6.text && binding.btn6.text == binding.btn9.text && (binding.btn3.text == "X" || binding.btn3.text == "O"))  {
            win = true
             return win
        }
         if (binding.btn1.text == binding.btn5.text && binding.btn1.text == binding.btn9.text && (binding.btn5.text == "X" || binding.btn5.text == "O")) {
            win = true
             return win
        }
         if (binding.btn5.text == binding.btn7.text && binding.btn7.text == binding.btn3.text && (binding.btn5.text == "X" || binding.btn5.text == "O")) {
            win = true
             return win
        }

  return win
     }

    fun result(){
        if (ifWin()) {
            Toast.makeText(
                this, "The Winner iS ${
                    if (count == 0) {
                        "O"
                    } else {
                        "X"
                    }
                }", Toast.LENGTH_SHORT
            ).show()
          binding.btn1.setText("")
            binding.btn2.setText("")
            binding.btn3.setText("")
            binding.btn4.setText("")
            binding.btn5.setText("")
            binding.btn6.setText("")
            binding.btn7.setText("")
            binding.btn8.setText("")
            binding.btn9.setText("")
        }
    }



}