package com.everest.contacts

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

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
            intent.putExtra("FIRST_CONTACT", contactName1.text.toString())
            intent.putExtra("SECOND_CONTACT", contactName2.text.toString())
            intent.putExtra("FIRST_NUMBER", contactNumber1.text.toString())
            intent.putExtra("SECOND_NUMBER", contactNumber2.text.toString())
            startActivity(intent)
        }

    }
}

