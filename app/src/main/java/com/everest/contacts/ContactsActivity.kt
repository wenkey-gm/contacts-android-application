package com.everest.contacts

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ContactsActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)

        val contactOneName=intent.getStringExtra("FIRST_CONTACT")
        val contactTwoName=intent.getStringExtra("SECOND_CONTACT")
        val contactOneNumber=intent.getStringExtra("FIRST_NUMBER")
        val contactTwoNumber=intent.getStringExtra("SECOND_NUMBER")

        val contactOneNameTV = findViewById<TextView>(R.id.contactName1)
        val contactOneNumberTV = findViewById<TextView>(R.id.phoneNumber1)
        val contactTwoNameTV = findViewById<TextView>(R.id.contactName2)
        val contactTwoNumberTV = findViewById<TextView>(R.id.phoneNumber2)


        contactOneNameTV.text = contactOneName
        contactOneNumberTV.text = contactOneNumber
        contactTwoNameTV.text = contactTwoName
        contactTwoNumberTV.text = contactTwoNumber


    }


}