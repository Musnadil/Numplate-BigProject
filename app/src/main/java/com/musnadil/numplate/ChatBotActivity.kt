package com.musnadil.numplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ChatBotActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_bot)
        val actionbar = supportActionBar
        actionbar!!.title = "Tanya Bot"
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}