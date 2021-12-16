package com.musnadil.numplate.WebServices

import com.musnadil.numplate.Models.HistoryMasukModel
import com.musnadil.numplate.Models.ResponseLogin
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiEndpoint {

    @POST("datajoin.php")
    fun dataHistoryMasuk(): Call<HistoryMasukModel>

    @FormUrlEncoded
    @POST("login.php")
    fun login(
        @Field("post_nipy") nipy : String,
        @Field("post_password") pass : String
    ):Call<ResponseLogin>

}