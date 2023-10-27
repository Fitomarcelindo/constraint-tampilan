package by.marcel.tugas01

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.Button
import android.widget.EditText
import android.view.View
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    private var jk: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt = findViewById<EditText>(R.id.nama)
        val radio = findViewById<RadioGroup>(R.id.radioGroup)
        val pria = findViewById<RadioButton>(R.id.radioPria)
        val wanita = findViewById<RadioButton>(R.id.radioWanita)
        val cek1 = findViewById<CheckBox>(R.id.cekbox1)
        val cek2 = findViewById<CheckBox>(R.id.cekbox2)
        val cek3 = findViewById<CheckBox>(R.id.cekbox3)
        val btn = findViewById<Button>(R.id.btnlogin)

        radio.setOnCheckedChangeListener { _, checkedid ->
            when (checkedid) {
                R.id.radioPria -> jk = "Pria"
                R.id.radioWanita -> jk = "wanita"
            }

            btn.setOnClickListener {
                val marcel = txt.text.toString()
                val hobi = StringBuilder()
                if (cek1.isChecked) hobi.append("Coding, ")
                if (cek2.isChecked) hobi.append("Reading, ")
                if (cek3.isChecked) hobi.append("Traveling, ")
                val radioValue =
                    if (pria.isChecked) "Pria" else if (wanita.isChecked) "Wanita" else ""

                val bymarcel = Intent(this@MainActivity, Main2::class.java).apply {
                    putExtra(EXTRA_MESSAGE, marcel)
                    putExtra("HOBBIES", hobi.toString())
                    putExtra("GENDER", radioValue)
                }
                startActivity(bymarcel)
            }
        }
//
//    public final fun showdata(view: View) {
//        val toast = Toast.makeText(applicationContext, "Data sudah ditambahkan", Toast.LENGTH_SHORT)
//        toast.show()
//    }

        fun clear(view: View) {
            val EditText = findViewById<EditText>(R.id.nama)

            val radioPria = findViewById<RadioButton>(R.id.radioPria)
            val radioWanita = findViewById<RadioButton>(R.id.radioWanita)
            val cekbox1 = findViewById<CheckBox>(R.id.cekbox1)
            val cekbox2 = findViewById<CheckBox>(R.id.cekbox2)
            val cekbox3 = findViewById<CheckBox>(R.id.cekbox3)


            EditText.text.clear()
            radioPria.isChecked = false
            radioWanita.isChecked = false
            cekbox1.isChecked = false
            cekbox2.isChecked = false
            cekbox3.isChecked = false

        }

    }
}







