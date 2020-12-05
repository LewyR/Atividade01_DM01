package com.example.atividade

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

abstract class FitAppDatabase : RoomDatabase() {

    abstract fun atividadeDao() : AtividadeDAO

    companion object {

        private var database: FitAppDatabase? = null

        private val DATABASE = "FitAppDB"

        fun getInstance(context: Context): FitAppDatabase? {

            if(database == null)
                return criaBanco(context)
            else
                return database
        }

        private fun criaBanco(context: Context): FitAppDatabase {
            return Room.databaseBuilder(context, FitAppDatabase::class.java, DATABASE)
                .allowMainThreadQueries()
                .build()
        }
    }
}