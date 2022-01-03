package com.musnadil.numplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import com.musnadil.numplate.Adapters.HistoryMasukAdapter
import com.musnadil.numplate.Models.HistoryMasukModel
import com.musnadil.numplate.Util.ApiRetrofit
import kotlinx.android.synthetic.main.activity_history_masuk.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RekapActivity : AppCompatActivity() {

    private val api by lazy { ApiRetrofit().endpoint }
    private lateinit var historyMasukAdapter: HistoryMasukAdapter
    private lateinit var rvHistoryMasuk : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history_masuk)
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Rekap Masuk Keluar"
        //set button back
        actionbar.setDisplayHomeAsUpEnabled(true)
        setupList()

    }

    override fun onStart() {
        super.onStart()
        getHistoryMasuk()
    }
    private fun setupList(){
        rvHistoryMasuk = rv_hist_masuk
        historyMasukAdapter = HistoryMasukAdapter(arrayListOf())
        rvHistoryMasuk.adapter = historyMasukAdapter
    }
    private fun getHistoryMasuk(){

        api.dataHistoryMasuk().enqueue(object : Callback<HistoryMasukModel>{
            override fun onResponse(
                call: Call<HistoryMasukModel>,
                response: Response<HistoryMasukModel>
            ){
                if(response.isSuccessful){
                    val listHistoryMasuk = response.body()!!.history_masuk
                    historyMasukAdapter.setData(listHistoryMasuk)

                }
            }
            override fun onFailure(call: Call<HistoryMasukModel>, t: Throwable) {
                Log.e("HistoryMasukActivity",t.toString())
            }
        })
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}