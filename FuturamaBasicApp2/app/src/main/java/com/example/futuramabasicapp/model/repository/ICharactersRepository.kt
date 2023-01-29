package com.example.futuramabasicapp.model.repository

import com.example.futuramabasicapp.model.dto.characters.FuturamaCharacters

interface ICharactersRepository {
    suspend fun getCharacters(): List<FuturamaCharacters>
}