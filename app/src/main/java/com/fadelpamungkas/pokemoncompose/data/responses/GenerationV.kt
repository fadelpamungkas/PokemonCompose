package com.fadelpamungkas.pokemoncompose.data.responses


import com.fadelpamungkas.pokemoncompose.data.responses.BlackWhite
import com.google.gson.annotations.SerializedName

data class GenerationV(
    @SerializedName("black-white")
    val blackWhite: BlackWhite
)