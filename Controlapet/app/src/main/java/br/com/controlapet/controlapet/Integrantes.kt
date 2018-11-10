package br.com.controlapet.controlapet

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_integrantes.*

class Integrantes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_integrantes)

        btnIndex.setOnClickListener {
            val intent = Intent(this, Index::class.java)
            this.startActivity(intent)
        }
    }
}
