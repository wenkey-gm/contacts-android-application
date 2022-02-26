package com.everest.contacts

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import firstName
import firstNumber
import secondName
import secondNumber

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contactName1 = findViewById<EditText>(R.id.contactNameOne)
        val contactName2 = findViewById<EditText>(R.id.contactNameTwo)
        val contactNumber1 = findViewById<EditText>(R.id.contactNumberOne)
        val contactNumber2 = findViewById<EditText>(R.id.contactNumberTwo)


        val saveButton = findViewById<Button>(R.id.save_button)

        saveButton.setOnClickListener {
            val intent = Intent(this, ContactsActivity::class.java)
            intent.putExtra(firstName, contactName1.text.toString())
            intent.putExtra(secondName, contactName2.text.toString())
            intent.putExtra(firstNumber, contactNumber1.text.toString())
            intent.putExtra(secondNumber, contactNumber2.text.toString())
            startActivity(intent)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(firstName, findViewById<EditText>(R.id.contactNameOne).text.toString())
        outState.putString(secondName, findViewById<EditText>(R.id.contactNameTwo).text.toString())
        outState.putString(firstNumber, findViewById<EditText>(R.id.contactNumberOne).text.toString())
        outState.putString(secondNumber, findViewById<EditText>(R.id.contactNumberOne).text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        savedInstanceState.getString(firstName)
        savedInstanceState.get(secondName)
        savedInstanceState.get(firstNumber)
        savedInstanceState.get(secondNumber)

    }

}

