package com.example.futuramabasicapp.model.repository

import com.example.futuramabasicapp.model.dto.epsodes.FuturamaEpisodes

interface IEpisodesRepository {
    suspend fun getEpisodes(): List<FuturamaEpisodes>
}