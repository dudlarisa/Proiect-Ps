package model

/**
 * clasa pentru datele(anunturile) rezultate sub format json
 */
data class MyDataItem(
    val idAgent: Int,
    val idAnunt: Int,
    val locatie: String,
    val nrCamere: Int,
    val pret: Int,
    val suprafata: Int,
    val tipAnunt: String,
    val tipProprietate: String
)