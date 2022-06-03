package com.example.agentieimobiliara


import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageButton

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.anunturi.*

import model.MyDataItem
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.lang.StringBuilder

/**
 * clasa pentru interfata pincipala
 */
const val BASE_URL="http://192.168.95.1:8080/"
class MainActivity : AppCompatActivity() {


    /**
     * metoda care construieste interfata principala setandu-i continutul ca fiind fisierul .xml corespunzator
     * realizeaza  legatura intre butonul de login cu interfata de login( clasa LoginActivity)
     * si a celui de anunturi cu interfata de anunturi, dupa realizarea legaturii se apeleaza si functia de
     * getAnunturi si se populeaza testul din interfata respectiva
     * implementeaza floatingButton pentru e-mail
     */
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
     //   getMyData()


       val fab: FloatingActionButton = floatingButton
        fab.setOnClickListener(View.OnClickListener { view ->
            Snackbar.make(view, "Send as an email to vladhouse@gmail.com!", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        })


       val b1: ImageButton=loginButton
        b1.setOnClickListener() {
            intent = Intent(this@MainActivity, LoginActivity::class.java)

            startActivity(intent)    }



      /*  val b2: ImageButton=anunturiButton
        b2.setOnClickListener() {
           intent = Intent(this@MainActivity, AnunturiActivity::class.java)

            startActivity(intent)
        getMyData()}*/
        val anunturi: ImageButton=anunturiButton
        anunturi.setOnClickListener (View.OnClickListener { view ->
            setContentView(R.layout.anunturi)
        getMyData()})


    }

    /**
     * functie care se foloseste de Retrofit pentru a extrage datele despre anunturi
     * dupa ce extragem datele in responseBody construim stringul care va fi afisat
     * si setamn textul din fereasta de anunturi cu valoarea acestuia
     *
     * */
    private fun getMyData(){

        val retrofitBuilder= Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(OpInterface::class.java)
        val retrofitData=retrofitBuilder.getAnunturi()
        retrofitData.enqueue(object : Callback<List<MyDataItem>?> {
            override fun onResponse(
                call: Call<List<MyDataItem>?>,
                response: Response<List<MyDataItem>?>
            ) {
              val responseBody=response.body()!!
                val myStringBuilder=StringBuilder()
                for(myData in responseBody){
                    myStringBuilder.append(myData.idAnunt)
                    myStringBuilder.append("\n")
                    myStringBuilder.append(myData.tipAnunt)
                    myStringBuilder.append("\n Locatie: ")
                    myStringBuilder.append(myData.locatie)
                    myStringBuilder.append("\n Numar camere: ")
                    myStringBuilder.append(myData.nrCamere)
                    myStringBuilder.append("\n Suprafata: ")
                    myStringBuilder.append(myData.suprafata)
                    myStringBuilder.append("\n Pret: ")
                    myStringBuilder.append(myData.pret)
                    myStringBuilder.append("\n\n")



                }
                textview_anunturi.text=myStringBuilder

            }

            override fun onFailure(call: Call<List<MyDataItem>?>, t: Throwable) {

                Log.d("  Main","Error")
            }
        })

    }



     }



