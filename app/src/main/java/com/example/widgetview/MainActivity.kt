package com.example.widgetview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tambah = findViewById<ImageButton>(R.id.tambah)
        val hapus = findViewById<ImageButton>(R.id.hapus)
        val txtnama = findViewById<EditText>(R.id.txtnama)
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val cbcoding = findViewById<CheckBox>(R.id.cbcoding)
        val cbreading = findViewById<CheckBox>(R.id.cbreading)
        val cbtraveling = findViewById<CheckBox>(R.id.cbtraveling)

        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            val radio: RadioButton = findViewById(checkedId)
            Toast.makeText(
                applicationContext,
                "Gender terpilih : ${radio.text}",
                Toast.LENGTH_SHORT
            ).show()

            tambah.setOnClickListener {
                Toast.makeText(
                    this@MainActivity,
                    "Nama: " + txtnama.text + ", gender: " + radio.text,
                    Toast.LENGTH_LONG
                ).show()
            }

            hapus.setOnClickListener {
                txtnama.text.clear()
                Toast.makeText(this@MainActivity, "Dihapus", Toast.LENGTH_LONG).show()
            }
        }
        printHobby()
    }

    fun printHobby() {
        val cbcoding = findViewById<CheckBox>(R.id.cbcoding)
        val cbreading = findViewById<CheckBox>(R.id.cbreading)
        val cbtraveling = findViewById<CheckBox>(R.id.cbtraveling)
        cbcoding.setOnClickListener {
            if (cbcoding.isChecked) {
                Toast.makeText(applicationContext, "Anda memilih hobi ${cbcoding.text}", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(applicationContext, "Anda membatalkan pilihan ${cbcoding.text}", Toast.LENGTH_LONG).show()
            }
        }

        cbreading.setOnClickListener {
            if (cbreading.isChecked) {
                Toast.makeText(applicationContext, "Anda memilih hobi ${cbreading.text}", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(applicationContext, "Anda membatalkan pilihan ${cbreading.text}", Toast.LENGTH_LONG).show()
            }
        }

        cbtraveling.setOnClickListener {
            if (cbtraveling.isChecked) {
                Toast.makeText(applicationContext, "Anda memilih hobi ${cbtraveling.text}", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(applicationContext, "Anda membatalkan pilihan ${cbtraveling.text}", Toast.LENGTH_LONG).show()
            }
        }
    }
}
