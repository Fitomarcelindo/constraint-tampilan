package by.marcel.tugas01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.TextView


class Main2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main2)

        val hsl = intent.getStringExtra(EXTRA_MESSAGE)

        val tvhasil = findViewById<TextView>(R.id.etUsername).apply { text = hsl }
        tvhasil.text = ""+hsl
    }
}









