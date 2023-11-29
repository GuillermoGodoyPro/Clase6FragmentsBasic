package com.matesdev.clase6fragmentsbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private lateinit var floatingButton: FloatingActionButton
    private var isModoLight: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        floatingButton = findViewById(R.id.floatingActionButton)

        floatingButton.setOnClickListener {

            if(isModoLight){
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainerView, DarkFragment()).commit()

            }else{
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainerView, BlankFragment()).commit()
            }

            //Seteamos isModoLight -> haga lo que haga dentro if o else, isModoLight cambia de estado
            isModoLight = !isModoLight


        }
    }
}