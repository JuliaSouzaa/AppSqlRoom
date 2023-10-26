package com.example.approom.controller

import androidx.room.Database

@Database(
    entities = [Contato::class],
    version = 1,
)

abstract class ContatoDataBase {

}