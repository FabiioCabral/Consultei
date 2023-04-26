package com.example.empregaeu3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.empregaeu3.databinding.ActivitySegundaTelaBinding
import com.example.empregaeu3.databinding.ActivityTela3Binding

private lateinit var binding: ActivityTela3Binding

class Tela3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTela3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_tela3)
    }
}