package com.example.android.logiccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var binary = false
    var decimal = true
    var hexadecimal = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun button0(v: View) {
        text_display.text = text_display.text.toString().plus("0")
    }

    fun button1(v: View) {
        text_display.text = text_display.text.toString().plus("1")
    }

    fun button2(v: View) {
        text_display.text = text_display.text.toString().plus("2")
    }

    fun button3(v: View) {
        text_display.text = text_display.text.toString().plus("3")
    }

    fun button4(v: View) {
        text_display.text = text_display.text.toString().plus("4")
    }

    fun button5(v: View) {
        text_display.text = text_display.text.toString().plus("5")
    }

    fun button6(v: View) {
        text_display.text = text_display.text.toString().plus("6")
    }

    fun button7(v: View) {
        text_display.text = text_display.text.toString().plus("7")
    }

    fun button8(v: View) {
        text_display.text = text_display.text.toString().plus("8")
    }

    fun button9(v: View) {
        text_display.text = text_display.text.toString().plus("9")
    }

    fun buttonA(v: View) {
        text_display.text = text_display.text.toString().plus("A")
    }

    fun buttonB(v: View) {
        text_display.text = text_display.text.toString().plus("B")
    }

    fun buttonC(v: View) {
        text_display.text = text_display.text.toString().plus("C")
    }

    fun buttonD(v: View) {
        text_display.text = text_display.text.toString().plus("D")
    }

    fun buttonE(v: View) {
        text_display.text = text_display.text.toString().plus("E")
    }

    fun buttonF(v: View) {
        text_display.text = text_display.text.toString().plus("F")
    }

    fun add(v: View) {

    }

    fun subtract(v: View) {

    }

    fun multiply(v: View) {

    }

    fun divide(v: View) {

    }

    fun equal(v: View) {

    }

    fun cancel(v: View) {

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

}
