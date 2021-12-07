package com.musnadil.numplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HistoryMasukActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history_masuk)
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Kendaraan Masuk"
        //set button back
        actionbar.setDisplayHomeAsUpEnabled(true)


    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}