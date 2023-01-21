package com.example.futuramabasicapp.api.utils

import com.example.futuramabasicapp.model.dto.characters.FuturamaCharacters
import com.example.futuramabasicapp.model.dto.episodes.FuturamaEpisodes
import retrofit2.Response
import retrofit2.http.GET

interface FuturamaClient {
    @GET("characters")
    suspend fun getCharacters(): Response<FuturamaCharacters>

    @GET("episodes")
    suspend fun getEpisodes(): Response<FuturamaEpisodes>
}