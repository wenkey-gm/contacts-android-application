package com.everest.contacts.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Contact(val name:String, val phoneNumber: String)  : Parcelable{

}