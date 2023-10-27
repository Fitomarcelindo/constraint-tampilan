package by.marcel.tugas01

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.Button
import android.widget.TextView



class Main2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main2)

        val hsl = intent.getStringExtra(EXTRA_MESSAGE)
        val hslgroup = intent.getStringExtra("GENDER")
        val cek = intent.getStringExtra("HOBBIES")

        val tvhasil = findViewById<TextView>(R.id.etUsername)
        tvhasil.text = hsl

        val group = findViewById<TextView>(R.id.gender)
        group.text = hslgroup

        val hslcek = findViewById<TextView>(R.id.etPassword)
        hslcek.text = cek

        val btn = findViewById<Button>(R.id.btnshare)
        btn.setOnClickListener{
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, "hey bloody ")
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, "please choose apps"))
        }

    }
}









