package com.example.kotlinrecyclerview


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import jp.wasabeef.recyclerview.animators.SlideInUpAnimator
import kotlinx.android.synthetic.main.item_contact.view.*

class MainActivity : AppCompatActivity() {

    private lateinit var rvContacts: RecyclerView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        rvContacts = findViewById(R.id.rvContacts)


        val contacts = createContact()
        rvContacts.adapter = ContactAdapter(this, contacts)
        rvContacts.layoutManager = LinearLayoutManager(this)



    }

    private fun createContact(): List<Contact> {
        val contacts = mutableListOf<Contact>()
        for (i in 1..150) contacts.add(Contact("Person #$i", i))
        return contacts
    }
}