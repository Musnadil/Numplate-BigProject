package com.musnadil.numplate.Models

data class HistoryMasukModel (
//    val response : Boolean,
//    var data : LoginModel,
    val history_masuk: List<Data_masuk>
) {
    data class Data_masuk(val nomer_plat:String?, val time:String?)
}

