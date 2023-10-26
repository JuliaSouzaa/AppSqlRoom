package com.example.approom.controller

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.approom.model.Contato //importar o contato referente ao model e todos eles poderão reconhece-lo

@Dao
interface ContatoDao {
   @Insert
   fun insertContato(contato: Contato)
   @Update
   fun updateContato(contato: Contato)
   @Delete
   fun deleteContato(contato: Contato)

   @Query("SELECT * FROM contatos ORDER BY nome ASC")
   fun getContatoOrdenadoPeloNome()

   @Query("SELECT * FROM contatos ORDER BY sobrenome ASC")
   fun getContatoOrdenadoPeloSobrenome()

   @Query("SELECT * FROM contatos ORDER BY telefone ASC")
   fun getContatoOrdenadoPeloTelefone()
}