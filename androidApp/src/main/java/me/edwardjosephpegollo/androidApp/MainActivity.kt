package me.edwardjosephpegollo.androidApp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import me.edwardjosephpegollo.shared.Greeting
import android.widget.TextView
import me.edwardjosephpegollo.shared.Presenter

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val headerText: TextView = findViewById(R.id.text_header)
        val counterText: TextView = findViewById(R.id.text_counter)

        val presenter = Presenter().apply {
            viewStateListener = {
                headerText.text = "Krement in ${it.platform}"
                counterText.text = it.counter
            }
        }

        findViewById<Button>(R.id.button_inkrement).setOnClickListener {
            presenter.onIncClick()
        }
        findViewById<Button>(R.id.button_dekrement).setOnClickListener {
            presenter.onDecClick()
        }
    }
}
