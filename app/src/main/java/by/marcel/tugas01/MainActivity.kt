package by.marcel.tugas01

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.view.View
import android.widget.CheckBox
import android.widget.ImageButton
import android.widget.RadioButton
import by.marcel.tugas01.R.id.button2
import com.google.android.material.textfield.TextInputLayout
import com.google.android.material.textfield.TextInputEditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        button()
    }

    fun showdata(view: View) {
        val toast = Toast.makeText(applicationContext, "Data sudah ditambahkan", Toast.LENGTH_SHORT)
        toast.show()
    }

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







