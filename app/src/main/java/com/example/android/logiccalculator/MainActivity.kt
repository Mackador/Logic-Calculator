package com.example.android.logiccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var binary = false
    var decimal = true
    var hexadecimal = false

    var add = false
    var sub = false
    var mul = false
    var div = false

    var val1 = 0.0f
    var val2 = 0.0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun button0(v: View) {
        if (text_display.text != "" && !add && !sub && !mul && !div) {
            clear()
        }
        text_display.text = text_display.text.toString().plus("0")
    }

    fun button1(v: View) {
        if (text_display.text != "" && !add && !sub && !mul && !div) {
            clear()
        }
        text_display.text = text_display.text.toString().plus("1")
    }

    fun button2(v: View) {
        if (text_display.text != "" && !add && !sub && !mul && !div) {
            clear()
        }
        if (binary) {
            text_display.text = "Unavailable"
        } else {
            text_display.text = text_display.text.toString().plus("2")
        }
    }

    fun button3(v: View) {
        if (text_display.text != "" && !add && !sub && !mul && !div) {
            clear()
        }
        if (binary) {
            text_display.text = "Unavailable"
        } else {
            text_display.text = text_display.text.toString().plus("3")
        }
    }

    fun button4(v: View) {
        if (text_display.text != "" && !add && !sub && !mul && !div) {
            clear()
        }
        if (binary) {
            text_display.text = "Unavailable"
        } else {
            text_display.text = text_display.text.toString().plus("4")
        }
    }

    fun button5(v: View) {
        if (text_display.text != "" && !add && !sub && !mul && !div) {
            clear()
        }
        if (binary) {
            text_display.text = "Unavailable"
        } else {
            text_display.text = text_display.text.toString().plus("5")
        }
    }

    fun button6(v: View) {
        if (text_display.text != "" && !add && !sub && !mul && !div) {
            clear()
        }
        if (binary) {
            text_display.text = "Unavailable"
        } else {
            text_display.text = text_display.text.toString().plus("6")
        }
    }

    fun button7(v: View) {
        if (text_display.text != "" && !add && !sub && !mul && !div) {
            clear()
        }
        if (binary) {
            text_display.text = "Unavailable"
        } else {
            text_display.text = text_display.text.toString().plus("7")
        }
    }

    fun button8(v: View) {
        if (text_display.text != "" && !add && !sub && !mul && !div) {
            clear()
        }
        if (text_display.text != "" && !add && !sub && !mul && !div) {
            clear()
        }
        if (binary) {
            text_display.text = "Unavailable"
        } else {
            text_display.text = text_display.text.toString().plus("8")
        }
    }

    fun button9(v: View) {
        if (text_display.text != "" && !add && !sub && !mul && !div) {
            clear()
        }
        if (binary) {
            text_display.text = "Unavailable"
        } else {
            text_display.text = text_display.text.toString().plus("9")
        }
    }

    fun buttonA(v: View) {
        if (text_display.text != "" && !add && !sub && !mul && !div) {
            clear()
        }
        if (binary || decimal) {
            text_display.text = "Unavailable"
        } else {
            text_display.text = text_display.text.toString().plus("A")
        }
    }

    fun buttonB(v: View) {
        if (text_display.text != "" && !add && !sub && !mul && !div) {
            clear()
        }
        if (binary || decimal) {
            text_display.text = "Unavailable"
        } else {
            text_display.text = text_display.text.toString().plus("B")
        }
    }

    fun buttonC(v: View) {
        if (text_display.text != "" && !add && !sub && !mul && !div) {
            clear()
        }
        if (binary || decimal) {
            text_display.text = "Unavailable"
        } else {
            text_display.text = text_display.text.toString().plus("C")
        }
    }

    fun buttonD(v: View) {
        if (text_display.text != "" && !add && !sub && !mul && !div) {
            clear()
        }
        if (binary || decimal) {
            text_display.text = "Unavailable"
        } else {
            text_display.text = text_display.text.toString().plus("D")
        }
    }

    fun buttonE(v: View) {
        if (text_display.text != "" && !add && !sub && !mul && !div) {
            clear()
        }
        if (binary || decimal) {
            text_display.text = "Unavailable"
        } else {
            text_display.text = text_display.text.toString().plus("E")
        }
    }

    fun buttonF(v: View) {
        if (text_display.text != "" && !add && !sub && !mul && !div) {
            clear()
        }
        if (binary || decimal) {
            text_display.text = "Unavailable"
        } else {
            text_display.text = text_display.text.toString().plus("F")
        }
    }

    fun add(v: View) {
        if (binary) {

        } else if (decimal) {
            val1 = text_display.text.toString().toFloat()
            add = true
            text_display.text = ""
        } else if (hexadecimal) {

        }
    }

    fun subtract(v: View) {
        if (binary) {

        } else if (decimal) {
            val1 = text_display.text.toString().toFloat()
            sub = true
            text_display.text = ""
        } else if (hexadecimal) {

        }
    }

    fun multiply(v: View) {
        if (binary) {

        } else if (decimal) {
            val1 = text_display.text.toString().toFloat()
            mul = true
            text_display.text = ""
        } else if (hexadecimal) {

        }
    }

    fun divide(v: View) {
        if (binary) {

        } else if (decimal) {
            val1 = text_display.text.toString().toFloat()
            div = true
            text_display.text = ""
        } else if (hexadecimal) {

        }
    }

    fun equal(v: View) {
        if (binary) {

        } else if (decimal) {
            if (add) {
                val2 = text_display.text.toString().toFloat()
                text_display.text = (val1 + val2).toString()
                add = false
            } else if (sub) {
                val2 = text_display.text.toString().toFloat()
                text_display.text = (val1 - val2).toString()
                sub = false
            } else if (mul) {
                val2 = text_display.text.toString().toFloat()
                text_display.text = (val1 * val2).toString()
                mul = false
            } else if (div) {
                val2 = text_display.text.toString().toFloat()
                text_display.text = (val1 / val2).toString()
                div = false
            }
        } else if (hexadecimal) {

        }
    }

    fun cancel(v: View) {
        clear()
    }

    fun change(v: View) {
        if (!binary && decimal && !hexadecimal) {
            binary = false
            decimal = false
            hexadecimal = true
            text_base.text = "HEX"
        } else if (!binary && !decimal && hexadecimal) {
            binary = true
            decimal = false
            hexadecimal = false
            text_base.text = "BIN"
        } else if (binary && !decimal && !hexadecimal) {
            binary = false
            decimal = true
            hexadecimal = false
            text_base.text = "DEC"
        }
    }

    // Helper functions ---------------------------------------------------------------

    private fun clear() {
        text_display.text = ""
    }

}
