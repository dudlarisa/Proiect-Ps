package model

import com.google.gson.annotations.SerializedName

data class Anunt(

    val idAnunt: Int,
    val idAgent: Int,
    val tipAnunt: String,
    val tipProprietate: String,
    val locatie: String,
    val nrCamere: Int,
    val suprafata: Int,

    val pret: Int
)
