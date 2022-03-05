package com.everest.contacts

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.everest.contacts.constants.*
import com.everest.contacts.databinding.ActivityContactsBinding
import com.everest.contacts.databinding.ActivityMainBinding
import com.everest.contacts.model.Contact

class ContactsActivity : AppCompatActivity(){

    private lateinit var binding: ActivityContactsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val firstContact = intent.getParcelableExtra<Contact>(FIRST_CONTACT)
        val secondContact = intent.getParcelableExtra<Contact>(SECOND_CONTACT)

        binding.contactName1.text= firstContact?.name
        binding.contactName2.text= secondContact?.name
        binding.phoneNumber1.text=firstContact?.phoneNumber
        binding.phoneNumber2.text= secondContact?.phoneNumber


    }
    override fun onSaveInstanceState(outState: Bundle) {

        val firstContact = Contact(
            binding.contactName1.text.toString(),
            binding.phoneNumber1.text.toString()
        )
        val secondContact = Contact(
            binding.contactName2.text.toString(),
            binding.phoneNumber2.text.toString()
        )
        outState.putParcelable(FIRST_CONTACT, firstContact)
        outState.putParcelable(SECOND_CONTACT, secondContact)

        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        savedInstanceState.getParcelable<Contact>(FIRST_CONTACT)
        savedInstanceState.getParcelable<Contact>(SECOND_CONTACT)
        super.onRestoreInstanceState(savedInstanceState)
    }

}