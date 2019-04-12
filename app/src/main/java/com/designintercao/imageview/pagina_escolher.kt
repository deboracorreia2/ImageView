package com.designintercao.imageview

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class pagina_escolher : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina_escolher)
    }
    fun Click(view: View) {
        var intent: Intent = Intent(this,MainActivity::class.java)
        var img = findViewById<View>(R.id.imagem1) as ImageView
        img.srcCompat
        startActivity(intent)


        }
    }



private fun ImageView.setImageDrawable(imagem1: ImageView?) {

}
