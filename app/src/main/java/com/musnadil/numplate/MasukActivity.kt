package com.musnadil.numplate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_masuk.*

class MasukActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_masuk)
        masuk()
    }

    private fun masuk(){
        btn_masuk.setOnClickListener {
            if(et_plat.text.toString().isEmpty()){
                plat_wrap.error = "No Plat tidak boleh kosong"
                password_wrap.error = null
            }else if (et_password.text.toString().isEmpty()) {
                password_wrap.error = "Password tidak boleh kosong"
                plat_wrap.error = null
            }else{
                plat_wrap.error = null
                password_wrap.error = null
                intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}