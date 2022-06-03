package com.example.agentieimobiliara

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_register.*

/**
 * clasa care reprezinta pagina de register a aplicatiei
 */
class RegisterActivity : AppCompatActivity() {

    /**
     * metoda care construieste interfata de register setandu-i continutul ca fiind fisierul .xml corespunzator
     * realizeaza si legatura intre butonul de back cu interfata de Login( clasa LoginActivity)
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val b1: ImageButton =backButton2
        b1.setOnClickListener() {
            intent = Intent(this@RegisterActivity,LoginActivity::class.java)

            startActivity(intent)    }
    }
}