package br.com.devmob.aula4ma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonToast.setOnClickListener{
            val texto = editTextTextPersonName.text.toString()
            Toast.makeText(this, texto, Toast.LENGTH_SHORT).show()
        }
        buttonTela2.setOnClickListener {
            val intent = Intent(this, Tela2Activity::class.java)
            intent.putExtra("nome", "Diogo Rodrigues")
            intent.putExtra("idade", 50)
            startActivity(intent)
        }

        buttonParcel.setOnClickListener{
            val intent = Intent(this, Tela2Activity::class.java)
            intent.putExtra("cliente",Cliente(20, "Fabiano Silva"))
            startActivity(intent)
        }
    }
    
    override fun onStart(){
        super.onStart()
        Log.i("NGVL","Tela1::onStart")
    }
    
    override fun onResume(){
        super.onResume()
        Log.i("NGVL", "Tela1:: onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("NGVL", "Tela1:: onRestar")
    }

    override fun onPause() {
        super.onPause()
        Log.i("NGVL", "Tela1:: onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("NGVL", "Tela1:: onDestroy")
    }

    override fun onStop() {
        super.onStop()
        Log.i("NGVL", "Tela1:: onStop")
    }
}