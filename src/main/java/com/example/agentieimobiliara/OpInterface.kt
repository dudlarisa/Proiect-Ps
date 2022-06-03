package com.example.agentieimobiliara

import model.Anunt
import model.MyDataItem
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*

/**
 * interfata pentru legatura dintre metoda si url specific
 */
interface OpInterface {
    /**
     * functia get pentru anunturi
     */
    @GET("api/getAnunturi")
    fun getAnunturi(): Call<List<MyDataItem>>

    /**
     * functia get pentru anunturi in functie de pret
     */

    @GET("api/getAnunturi/pret/{pret}")
    fun getAnunturiByPret(@Path("pret") pret:Int): Call<List<MyDataItem>>


}