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

    var calculated = false

    var val1 = 0
    var val2 = 0

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
        if (text_display.text == "Unavailable" || calculated) {
            clear()
            calculated = false
        }
        text_display.text = text_display.text.toString().plus("1")
    }

    fun button2(v: View) {
        if (text_display.text == "Unavailable" || calculated) {
            clear()
            calculated = false
        }
        if (binary) {
            text_display.text = "Unavailable"
        } else {
            text_display.text = text_display.text.toString().plus("2")
        }
    }

    fun button3(v: View) {
        if (text_display.text == "Unavailable" || calculated) {
            clear()
            calculated = false
        }
        if (binary) {
            text_display.text = "Unavailable"
        } else {
            text_display.text = text_display.text.toString().plus("3")
        }
    }

    fun button4(v: View) {
        if (text_display.text == "Unavailable" || calculated) {
            clear()
            calculated = false
        }
        if (binary) {
            text_display.text = "Unavailable"
        } else {
            text_display.text = text_display.text.toString().plus("4")
        }
    }

    fun button5(v: View) {
        if (text_display.text == "Unavailable" || calculated) {
            clear()
            calculated = false
        }
        if (binary) {
            text_display.text = "Unavailable"
        } else {
            text_display.text = text_display.text.toString().plus("5")
        }
    }

    fun button6(v: View) {
        if (text_display.text == "Unavailable" || calculated) {
            clear()
            calculated = false
        }
        if (binary) {
            text_display.text = "Unavailable"
        } else {
            text_display.text = text_display.text.toString().plus("6")
        }
    }

    fun button7(v: View) {
        if (text_display.text == "Unavailable" || calculated) {
            clear()
            calculated = false
        }
        if (binary) {
            text_display.text = "Unavailable"
        } else {
            text_display.text = text_display.text.toString().plus("7")
        }
    }

    fun button8(v: View) {
        if (text_display.text == "Unavailable" || calculated) {
            clear()
            calculated = false
        }
        if (binary) {
            text_display.text = "Unavailable"
        } else {
            text_display.text = text_display.text.toString().plus("8")
        }
    }

    fun button9(v: View) {
        if (text_display.text == "Unavailable" || calculated) {
            clear()
            calculated = false
        }
        if (binary) {
            text_display.text = "Unavailable"
        } else {
            text_display.text = text_display.text.toString().plus("9")
        }
    }

    fun buttonA(v: View) {
        if (text_display.text == "Unavailable" || calculated) {
            clear()
            calculated = false
        }
        if (binary || decimal) {
            text_display.text = "Unavailable"
        } else {
            text_display.text = text_display.text.toString().plus("A")
        }
    }

    fun buttonB(v: View) {
        if (text_display.text == "Unavailable" || calculated) {
            clear()
            calculated = false
        }
        if (binary || decimal) {
            text_display.text = "Unavailable"
        } else {
            text_display.text = text_display.text.toString().plus("B")
        }
    }

    fun buttonC(v: View) {
        if (text_display.text == "Unavailable" || calculated) {
            clear()
            calculated = false
        }
        if (binary || decimal) {
            text_display.text = "Unavailable"
        } else {
            text_display.text = text_display.text.toString().plus("C")
        }
    }

    fun buttonD(v: View) {
        if (text_display.text == "Unavailable" || calculated) {
            clear()
            calculated = false
        }
        if (binary || decimal) {
            text_display.text = "Unavailable"
        } else {
            text_display.text = text_display.text.toString().plus("D")
        }
    }

    fun buttonE(v: View) {
        if (text_display.text == "Unavailable" || calculated) {
            clear()
            calculated = false
        }
        if (binary || decimal) {
            text_display.text = "Unavailable"
        } else {
            text_display.text = text_display.text.toString().plus("E")
        }
    }

    fun buttonF(v: View) {
        if (text_display.text == "Unavailable" || calculated) {
            clear()
            calculated = false
        }
        if (binary || decimal) {
            text_display.text = "Unavailable"
        } else {
            text_display.text = text_display.text.toString().plus("F")
        }
    }

    fun add(v: View) {
        when {
            binary -> {
                val1 = binToDec(text_display.text.toString())
                add = true
                text_display.text = ""
            }
            decimal -> {
                val1 = text_display.text.toString().toInt()
                add = true
                text_display.text = ""
            }
            hexadecimal -> {
                val1 = hexToDec(text_display.text.toString())
                add = true
                text_display.text = ""
            }
        }
    }

    fun subtract(v: View) {
        when {
            binary -> {
                val1 = binToDec(text_display.text.toString())
                sub = true
                text_display.text = ""
            }
            decimal -> {
                val1 = text_display.text.toString().toInt()
                sub = true
                text_display.text = ""
            }
            hexadecimal -> {
                val1 = hexToDec(text_display.text.toString())
                sub = true
                text_display.text = ""
            }
        }
    }

    fun multiply(v: View) {
        when {
            binary -> {
                val1 = binToDec(text_display.text.toString())
                mul = true
                text_display.text = ""
            }
            decimal -> {
                val1 = text_display.text.toString().toInt()
                mul = true
                text_display.text = ""
            }
            hexadecimal -> {
                val1 = hexToDec(text_display.text.toString())
                mul = true
                text_display.text = ""
            }
        }
    }

    fun divide(v: View) {
        when {
            binary -> {
                val1 = binToDec(text_display.text.toString())
                div = true
                text_display.text = ""
            }
            decimal -> {
                val1 = text_display.text.toString().toInt()
                div = true
                text_display.text = ""
            }
            hexadecimal -> {
                val1 = hexToDec(text_display.text.toString())
                div = true
                text_display.text = ""
            }
        }
    }

    // Calculates the given addition/subtraction/multiplication/division operation
    fun equal(v: View) {
        when {
            binary -> {
                when {
                    add -> {
                        val2 = binToDec(text_display.text.toString())
                        text_display.text = decToBin(val1 + val2).reversed()
                        add = false
                    }
                    sub -> {
                        val2 = text_display.text.toString().toInt()
                        text_display.text = decToBin(val1 - val2).reversed()
                        sub = false
                    }
                    mul -> {
                        val2 = text_display.text.toString().toInt()
                        text_display.text = decToBin(val1 * val2).reversed()
                        mul = false
                    }
                    div -> {
                        val2 = text_display.text.toString().toInt()
                        text_display.text = decToBin(val1 / val2).reversed()
                        div = false
                    }
                }
            }
            decimal -> {
                when {
                    add -> {
                        val2 = text_display.text.toString().toInt()
                        text_display.text = (val1 + val2).toString()
                        add = false
                    }
                    sub -> {
                        val2 = text_display.text.toString().toInt()
                        text_display.text = (val1 - val2).toString()
                        sub = false
                    }
                    mul -> {
                        val2 = text_display.text.toString().toInt()
                        text_display.text = (val1 * val2).toString()
                        mul = false
                    }
                    div -> {
                        val2 = text_display.text.toString().toInt()
                        text_display.text = (val1 / val2).toString()
                        div = false
                    }
                }
            }
            hexadecimal -> {
                when {
                    add -> {
                        val2 = hexToDec(text_display.text.toString())
                        text_display.text = decToHex(val1 + val2).reversed()
                        add = false
                    }
                    sub -> {
                        val2 = hexToDec(text_display.text.toString())
                        text_display.text = decToHex(val1 - val2).reversed()
                        sub = false
                    }
                    mul -> {
                        val2 = hexToDec(text_display.text.toString())
                        text_display.text = decToHex(val1 * val2).reversed()
                        mul = false
                    }
                    div -> {
                        val2 = hexToDec(text_display.text.toString())
                        text_display.text = decToHex(val1 / val2).reversed()
                        div = false
                    }
                }
            }
        }
        calculated = true
    }

    // Cancels the current operation and clears the display
    fun cancel(v: View) {
        clear()
    }

    // Changes the base that the calculator is currently using
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

    // Converts the given decimal number, n, into the binary base
    private fun decToBin(n: Int): String {
        if (n == 1) {
            return "1"
        }
        return if (n % 2 == 1) {
            val temp = n/2
            "1".plus(decToBin(temp))
        } else {
            val temp = n/2
            "0".plus(decToBin(temp))
        }
    }

    // Converts the given binary number, x, into the decimal base
    private fun binToDec(x: String): Int {
        val arr = x.split("").subList(1,x.length+1)
        val n = (arr.size - 1)
        var number = 0
        for (i in n downTo 0) {
            number += arr[n - i].toInt() * pow(2,i)
        }
        return number
    }

    // Converts the given decimal number, n, into the hexadecimal base
    private fun decToHex(n: Int): String {
        if (n < 16) {
            return when (n) {
                10 -> "A"
                11 -> "B"
                12 -> "C"
                13 -> "D"
                14 -> "E"
                15 -> "F"
                else -> n.toString()
            }
        }
        var x = ((n.toDouble()/16 - n/16) * 16).toInt().toString()
        x = when (x) {
            "10" -> "A"
            "11" -> "B"
            "12" -> "C"
            "13" -> "D"
            "14" -> "E"
            "15" -> "F"
            else -> x
        }
        return x.plus(decToHex(n/16))
    }

    // Converts the given hexadecimal number, x, into the decimal base
    private fun hexToDec(x: String): Int {
        val arr = x.split("").subList(1,x.length+1)
        val n = (arr.size - 1)
        var number = 0
        for (i in n downTo 0) {
            number += when (arr[n - i]) {
                "A" -> 10 * pow(16,i)
                "B" -> 11 * pow(16,i)
                "C" -> 12 * pow(16,i)
                "D" -> 13 * pow(16,i)
                "E" -> 14 * pow(16,i)
                "F" -> 15 * pow(16,i)
                else -> arr[n - i].toInt() * pow(16,i)
            }
        }
        return number
    }

    // Clears the text on the calculator's display
    private fun clear() {
        text_display.text = ""
    }

    // Raises the given n to the power of the given x
    private fun pow(n: Int, x: Int): Int {
        var a = 1
        for (i in 1..x) {
            a *= n
        }
        return a
    }

}

