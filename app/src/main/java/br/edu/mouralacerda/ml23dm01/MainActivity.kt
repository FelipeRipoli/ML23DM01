package br.edu.mouralacerda.ml23dm01

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botao = findViewById<ImageButton>(R.id.btnProximo1)
        val nome = findViewById<EditText>(R.id.edtNome)
        val email = findViewById<EditText>(R.id.edtEmail)

        botao.setOnClickListener {

            val pacote = Bundle()
            pacote.putString("nome", nome.text.toString())
            pacote.putString("email", email.text.toString())

            val i = Intent(this, Tela02::class.java)

            i.putExtras(pacote)

            startActivity(i)
        }

    }
}