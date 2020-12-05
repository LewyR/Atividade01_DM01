package com.example.atividade

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        btnAdd.setOnClickListener {
            startActivity(Intent(this, AddActivity::class.java))
        }
    }

    override fun onResume(){
        super.onResume()

        val atividadeDAO = FitAppDatabase.getInstance(this)?.atividadeDao()
        val listaAtividade = atividadeDAO?.listar()

        val adp = ArrayAdapter<Atividade>(this, android.R.layout.simple_list_item_2, listaAtividade)
    }
}