package br.com.obejtospinner

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val listaFrutas = arrayListOf("Banana", "Maça", "Limão", "Melão", "Tangerina", "Maracuja", "Manga", "Tomate", "Fruta do Conde")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listaAdaptadaParaSpiner = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, listaFrutas)

        spnFrutas.adapter = listaAdaptadaParaSpiner
    }
}
