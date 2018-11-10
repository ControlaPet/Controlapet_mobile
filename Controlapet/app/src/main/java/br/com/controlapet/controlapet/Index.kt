package br.com.controlapet.controlapet

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.Button
import br.com.controlapet.controlapet.R.layout.activity_index
import br.com.controlapet.controlapet.R.layout.activity_integrantes
import kotlinx.android.synthetic.main.activity_index.*

class Index : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_index)

        btnColaboradores.setOnClickListener {
            val intent = Intent(this, Integrantes::class.java)
            this.startActivity(intent)
        }
        btnSobreNos.setOnClickListener {
            val intent = Intent(this, SobreNos::class.java)
            this.startActivity(intent)
        }
        btnProduto.setOnClickListener {
            val intent = Intent(this, NossoProduto::class.java)
            this.startActivity(intent)
        }
    }

}
