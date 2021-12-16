package com.musnadil.numplate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        hist_masuk()
        cust_service()
        logout()

    }

    private fun hist_masuk(){
        btn_history.setOnClickListener {
            startActivity(Intent(this,RekapActivity::class.java))
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