package com.designintercao.imageview

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun Click(view: View) {

        var intent: Intent = Intent(this,pagina_escolher::class.java)
        startActivity(intent)
}
}
