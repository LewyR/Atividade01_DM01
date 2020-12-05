package com.example.atividade

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface AtividadeDAO {

    @Insert
    fun salvar (a: Atividade)

    @Query("SELECT * FROM Atividade")
    fun listar() : List<Atividade>

}