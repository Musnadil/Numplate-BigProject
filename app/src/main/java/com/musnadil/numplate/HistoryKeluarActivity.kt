package com.musnadil.numplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HistoryKeluarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history_keluar)
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Kendaraan Keluar"
        //set button back
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}