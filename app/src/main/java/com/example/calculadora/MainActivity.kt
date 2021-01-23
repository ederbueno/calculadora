package com.example.calculadora

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    var numero1EditText: EditText? = null
    var numero2EditText: EditText? = null
    var adicaoButton: Button? = null
    var subtracaoButton: Button? = null
    var multiplicacaoButton: Button? = null
    var divisaoButton: Button? = null
    var resultadoTextView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        vincularComponentes()
        criarListeners()
    }

    fun vincularComponentes() {

        numero1EditText = findViewById(R.id.numero1EditText)
        numero2EditText = findViewById(R.id.numero2EditText)

        adicaoButton = findViewById(R.id.adicaoButton)
        subtracaoButton = findViewById(R.id.subtracaoButton)
        multiplicacaoButton = findViewById(R.id.multiplicacaoButton)
        divisaoButton = findViewById(R.id.divisaoButton)

        resultadoTextView = findViewById(R.id.resultadoTextView)
    }

    fun criarListeners() {
        adicaoButton!!.setOnClickListener { evt: View? -> adicionar() }
        subtracaoButton!!.setOnClickListener { evt: View? -> subtrair() }
        multiplicacaoButton!!.setOnClickListener { evt: View? -> multiplicar() }
        divisaoButton!!.setOnClickListener { evt: View? -> dividir() }

    }

    private fun adicionar() {

        val numero1String = numero1EditText!!.text.toString()
        val numero2String = numero2EditText!!.text.toString()

        if (numero1String.isEmpty() || numero2String.isEmpty()) {
            Toast.makeText(
                this, "Digite dois números",
                Toast.LENGTH_LONG
            ).show()
            return
        }

        val numero1 = numero1String.toDouble()
        val numero2 = numero2String.toDouble()

        val resultado = numero1 + numero2

        resultadoTextView!!.text = resultado.toString()

    }
    private fun subtrair() {

        val numero1String = numero1EditText!!.text.toString()
        val numero2String = numero2EditText!!.text.toString()
        if (numero1String.isEmpty() || numero2String.isEmpty()) {
            Toast.makeText(
                this, "Digite dois números",
                Toast.LENGTH_LONG
            ).show()
            return
        }

        val numero1 = numero1String.toDouble()
        val numero2 = numero2String.toDouble()

        val resultado = numero1 - numero2

        resultadoTextView!!.text = resultado.toString()


    }
    private fun multiplicar() {

        val numero1String = numero1EditText!!.text.toString()
        val numero2String = numero2EditText!!.text.toString()
        if (numero1String.isEmpty() || numero2String.isEmpty()) {
            Toast.makeText(
                this, "Digite dois números",
                Toast.LENGTH_LONG
            ).show()
            return
        }

        val numero1 = numero1String.toDouble()
        val numero2 = numero2String.toDouble()

        val resultado = numero1 * numero2

        resultadoTextView!!.text = resultado.toString()

    }


    private fun dividir() {

        val numero1String = numero1EditText!!.text.toString()
        val numero2String = numero2EditText!!.text.toString()
        if (numero1String.isEmpty() || numero2String.isEmpty()) {
            Toast.makeText(
                this, "Digite dois números",
                Toast.LENGTH_LONG
            ).show()
            return
        }
        val numero1 = numero1String.toDouble()
        val numero2 = numero2String.toDouble()
        if (numero2 == 0.0) {
            Toast.makeText(
                this, "Não é possível dividir por 0",
                Toast.LENGTH_LONG
            ).show()
            return
        }

        val resultado = numero1 / numero2
        resultadoTextView!!.text = resultado.toString()

    }


}