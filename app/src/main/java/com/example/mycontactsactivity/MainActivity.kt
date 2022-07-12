package com.example.mycontactsactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mycontactsactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContacts()
    }

    fun displayContacts() {
        var contact =
            Contacts("Judith", "owuorakinyijudith@gmail.com", "0757497424", "616 korongo","")
        var contact1 = Contacts("Anne", "annemary@gmail.com", "0768654396", "616 korongo ","")
        var contact2 = Contacts("Anne", "owuorakinyijudith@gmail.com", "0757497424", "616 korongo","")
        var contact3 = Contacts("Anne", "owuorakinyijudith@gmail.com", "0757497424", "616 korongo","")
        var contact4 = Contacts("Anne", "owuorakinyijudith@gmail.com", "0757497424", "616 korongo","")
        var contact5 = Contacts("Anne", "owuorakinyijudith@gmail.com", "0757497424", "616 korongo","")
        var contact6 = Contacts("Anne", "owuorakinyijudith@gmail.com", "0757497424", "616 korongo","")
        var contactlist =listOf(contact, contact1, contact2, contact3, contact4, contact5, contact6)


        var contactsAdapter = ContactsRvAdapter(contactlist)
        binding.rvcontacts.layoutManager = LinearLayoutManager(this)
        binding.rvcontacts.adapter = contactsAdapter
    }
}
