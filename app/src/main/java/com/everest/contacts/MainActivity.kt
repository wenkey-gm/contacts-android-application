package com.everest.contacts

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.everest.contacts.constants.*
import com.everest.contacts.databinding.ActivityMainBinding
import com.everest.contacts.model.Contact

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.saveButton.setOnClickListener {
            val intent = Intent(this, ContactsActivity::class.java)
            val firstContact = Contact(
                binding.contactName1.editText?.text.toString(),
                binding.contactNumber1.editText?.text.toString()
            )
            val secondContact = Contact(
                binding.contactName2.editText?.text.toString(),
                binding.contactNumber2.editText?.text.toString()
            )
            intent.putExtra(FIRST_CONTACT, firstContact)
            intent.putExtra(SECOND_CONTACT, secondContact)
            startActivity(intent)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {

        val firstContact = Contact(
            binding.contactName1.editText?.text.toString(),
            binding.contactNumber1.editText?.text.toString()
        )
        val secondContact = Contact(
            binding.contactName2.editText?.text.toString(),
            binding.contactNumber2.editText?.text.toString()
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

