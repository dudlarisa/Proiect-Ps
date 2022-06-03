package com.example.agentieimobiliara

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*

/**
 * clasa care reprezinta pagina de login a aplicatiei
 */
class LoginActivity : AppCompatActivity() {

    /**
     * metoda care construieste interfata de login setandu-i continutul ca fiind fisierul .xml corespunzator
     * realizeaza si legatura intre butonul de back cu interfata de principala( clasa MainActivity)
     * si a celui de Register cu interfata de register
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val b1: ImageButton =backButton
        b1.setOnClickListener() {
            intent = Intent(this@LoginActivity, MainActivity::class.java)

            startActivity(intent)    }

        val b2: Button =button2
        b2.setOnClickListener() {
            intent = Intent(this@LoginActivity, RegisterActivity::class.java)

            startActivity(intent)    }


    }
}