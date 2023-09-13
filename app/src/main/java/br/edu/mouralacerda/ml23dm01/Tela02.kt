package br.edu.mouralacerda.ml23dm01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText

class Tela02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela02)

        val nome = intent.extras!!.getString("nome")!!
        val email =  intent.extras!!.getString("email")!!

        val curso = findViewById<EditText>(R.id.edtCurso)
        val periodo = findViewById<EditText>(R.id.edtPeriodo)
        val botao = findViewById<EditText>(R.id.edt)

        botao.setOnClickListener {

            val pacote = Bundle()

            pacote.putString("nome", nome)
            pacote.putString(("email", email)
            pacote.putString("curso", curso.text.toString())
            pacote.putString("curso", periodo.text.toString())

            val i = Intent(this, Tela02::class.java)
                i.putExtras(pacote)
        }
    }
}