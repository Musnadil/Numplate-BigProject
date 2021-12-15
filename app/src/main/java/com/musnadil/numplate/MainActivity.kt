package com.musnadil.numplate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.musnadil.numplate.Models.LoginModel
import com.musnadil.numplate.Models.ResponseLogin
import com.musnadil.numplate.Util.ApiRetrofit
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        hist_masuk()
        hist_keluar()
        cust_service()
        logout()

    }

    private fun getuname(){

    }
    private fun hist_masuk(){
        btn_hist_masuk.setOnClickListener {
            startActivity(Intent(this,HistoryMasukActivity::class.java))
        }
    }
    private fun hist_keluar(){
        btn_hist_keluar.setOnClickListener {
            startActivity(Intent(this,HistoryKeluarActivity::class.java))
        }
    }

    private fun cust_service(){
        btn_customer_service.setOnClickListener {
            startActivity(Intent(this,ChatBotActivity::class.java))
        }
    }
    private fun logout(){
        btn_logout.setOnClickListener {
            val dialog_konfirmasi = AlertDialog.Builder(this)
            dialog_konfirmasi.apply{
                setTitle("Logout")
                setMessage("Apakah anda yakin ingin log out?")
                setNegativeButton("Batal"){dialog,which->
                    dialog.dismiss()
                }
                setPositiveButton("Logout"){dialog,which->
                    dialog.dismiss()
                    startActivity( Intent(this@MainActivity,MasukActivity::class.java))
                    onStop()
                    finish()
                }
            }
            dialog_konfirmasi.show()
        }
    }

}