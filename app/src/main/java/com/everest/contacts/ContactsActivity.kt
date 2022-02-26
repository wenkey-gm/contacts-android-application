package com.everest.contacts

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import firstName
import firstNumber
import secondName
import secondNumber

class ContactsActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)

        val contactOneName=intent.getStringExtra(firstName)
        val contactTwoName=intent.getStringExtra(secondName)
        val contactOneNumber=intent.getStringExtra(firstNumber)
        val contactTwoNumber=intent.getStringExtra(secondNumber)

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