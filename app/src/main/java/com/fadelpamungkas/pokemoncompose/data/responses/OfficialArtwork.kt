package com.fadelpamungkas.pokemoncompose.data.responses


import com.google.gson.annotations.SerializedName

data class OfficialArtwork(
    @SerializedName("front_default")
    val frontDefault: String
)