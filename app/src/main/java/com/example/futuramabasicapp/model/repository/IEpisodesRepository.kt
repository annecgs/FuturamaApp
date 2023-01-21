package com.example.futuramabasicapp.model.repository

import com.example.futuramabasicapp.model.dto.episodes.FuturamaEpisodes

interface IEpisodesRepository {
    suspend fun getEpisodes(): List<FuturamaEpisodes>
}
