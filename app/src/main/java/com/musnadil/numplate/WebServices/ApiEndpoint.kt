package com.musnadil.numplate.WebServices

import com.musnadil.numplate.Models.HistoryMasukModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiEndpoint {

    @GET("data.php")
    fun dataHistoryMasuk(): Call<HistoryMasukModel>

}