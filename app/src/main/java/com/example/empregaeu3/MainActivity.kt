package com.example.empregaeu3

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.empregaeu3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_main)

        val edNome = binding.edNome
        val btLogin = binding.btlogin
        val edSenha = binding.edSenha
        //out

        if (btLogin != null) {
            btLogin.setOnClickListener {
                if (edNome != null) {
                    if(edNome.text.toString()=="admin") {
                        //val texto = edNome.text.toString()
                        //Toast.makeText(this, texto, Toast.LENGTH_SHORT).show()
                        val intent = Intent(this, SegundaTelaActivity::class.java)
                        intent.putExtra("intentNomeUsuario", edNome.text.toString())
                        if (edSenha != null) {
                            intent.putExtra("intentSenhaUsuario", edSenha.text.toString())
                        }
                        startActivity(intent)
                    } else{
                        Toast.makeText(this, R.string.alerta, Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }

    }
}