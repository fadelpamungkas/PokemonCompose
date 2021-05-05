package com.fadelpamungkas.pokemoncompose.data.responses


import com.fadelpamungkas.pokemoncompose.data.responses.DreamWorld
import com.fadelpamungkas.pokemoncompose.data.responses.OfficialArtwork
import com.google.gson.annotations.SerializedName

data class Other(
    @SerializedName("dream_world")
    val dreamWorld: DreamWorld,
    @SerializedName("official-artwork")
    val officialArtwork: OfficialArtwork
)