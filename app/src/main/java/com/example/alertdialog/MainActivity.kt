package com.example.alertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView = findViewById<TextView>(R.id.textView)
        var editText = findViewById<EditText>(R.id.editText)
        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            textView.setText(editText.text)
        }

     //   AlertDialog()


    }
    private fun AlertDialog(){
        val dialog = AlertDialog.Builder(this)
        dialog.setTitle("Confirm Exit")
        dialog.setIcon(R.drawable.ic_launcher_background)
        dialog.setMessage("welcome to my stories ")
        dialog.setPositiveButton("yes"){dialog,which -> finish()}
        dialog.setNegativeButton("No",null)
        dialog.show()
    }
}