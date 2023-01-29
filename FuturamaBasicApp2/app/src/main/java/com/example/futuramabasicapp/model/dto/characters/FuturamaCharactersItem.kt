package com.example.futuramabasicapp.model.dto.characters

data class FuturamaCharactersItem(
    val age: String,
    val gender: String,
    val homePlanet: String,
    val id: Int,
    val images: Imagens,
    val name: Name,
    val occupation: String,
    val sayings: List<String>,
    val species: String
)
