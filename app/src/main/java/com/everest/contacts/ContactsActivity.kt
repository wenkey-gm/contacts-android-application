package com.everest.contacts

import android.os.Bundle
import android.widget.EditText
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
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(firstName, findViewById<TextView>(R.id.contactName1).text.toString())
        outState.putString(secondName, findViewById<TextView>(R.id.phoneNumber1).text.toString())
        outState.putString(firstNumber, findViewById<TextView>(R.id.contactName2).text.toString())
        outState.putString(secondNumber, findViewById<TextView>(R.id.phoneNumber2).text.toString())
    }

}