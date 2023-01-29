package com.example.futuramabasicapp.model.repository

import com.example.futuramabasicapp.model.dto.characters.FuturamaCharacters
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CharactersRepository(private val charactersClient: ICharactersRepository) : ICharactersRepository {
    override suspend fun getCharacters(): List<FuturamaCharacters> {
        return withContext(Dispatchers.IO) {
            charactersClient.getCharacters()
        }
    }
}