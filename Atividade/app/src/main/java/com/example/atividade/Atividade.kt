package com.example.atividade

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Atividade (val titulo: String,
                      val descricao: String,
                      val data: String,
                      val tempo: String,
                      val tipo: String,
                      val distancia: Double,
                      @PrimaryKey(autoGenerate = true)
                      val id: Int = 0) {
}