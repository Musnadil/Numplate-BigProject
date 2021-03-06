package com.musnadil.numplate.Util

import com.google.gson.GsonBuilder
import com.musnadil.numplate.WebServices.ApiEndpoint
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiRetrofit {

    val endpoint : ApiEndpoint
    get(){
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY

        val client = OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .build()

        val gson = GsonBuilder().setLenient().create()

        val retrofit = Retrofit.Builder()
            .baseUrl("http://192.168.43.172/bigproject/numplate/")
            .client(client)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
        return retrofit.create(ApiEndpoint::class.java)
    }
    fun getRetrofitClient(): Retrofit{
        return Retrofit.Builder()
            .baseUrl("http://192.168.43.172/bigproject/numplate/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    fun getInstance():ApiEndpoint{
        return getRetrofitClient().create(ApiEndpoint::class.java)
    }
}