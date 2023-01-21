package com.example.futuramabasicapp.model.repository

import com.example.futuramabasicapp.model.dto.episodes.FuturamaEpisodes
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class EpisodesRepository(private val episodesClient: IEpisodesRepository) : IEpisodesRepository {
    override suspend fun getEpisodes(): List<FuturamaEpisodes> {
        return withContext(Dispatchers.IO) {
            episodesClient.getEpisodes()
        }
    }
}