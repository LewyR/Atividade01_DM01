package com.example.atividade

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity

class AddActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)

        val tipos = resources.getStringArray(R.array.tipos)
        val adp = ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, tipos)
        spnTipo.adapter = adp

        btnSalvar.setOnClickListener {
            val atividadeDAO = FitAppDatabase.getInstance(this)?.atividadeDao()

            val titulo = edtTitulo.text.toString()
            val descricao = edtDescricao.text.toString()
            val data = edtData.text.toString()
            val tempo = edtTempo.text.toString()
            val tipo = spnTipo.selectItem.toString()
            val distancia = edtDistancia.text.toString().toDouble()

            val a = Atividade(titulo, descricao, data, tempo, tipo, distancia)

            atividadeDAO?.salvar(a)

        }
    }
}