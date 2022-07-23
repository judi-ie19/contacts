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
            Contacts("Emmah", "akinyi@gmail.com", "0757497424", "616 korongo","https://images.unsplash.com/photo-1658387067884-5716eb8379ca?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHwyOXx8fGVufDB8fHx8&auto=format&fit=crop&w=500&q=60")
        var contact4 = Contacts("Lydia", "mwende@gmail.com", "0723259040", "616 korongo","https://images.unsplash.com/photo-1535295972055-1c762f4483e5?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1yZWxhdGVkfDEzfHx8ZW58MHx8fHw%3D&auto=format&fit=crop&w=500&q=60")
        var contact5 = Contacts("Leocadia", "leo@gmail.com", "0776902309", "616 korongo","https://i.pinimg.com/564x/e9/65/7d/e9657d73ec08612ead694ee0a915e330.jpg")
        var contact6 = Contacts("Veine", "odwarveine@gmail.com", "0764087645", "616 korongo","https://images.unsplash.com/photo-1583994009785-37ec30bf9342?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTh8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contactlist =listOf(contact, contact4, contact5, contact6)


        var contactsAdapter = ContactsRvAdapter(contactlist)
        binding.rvcontacts.layoutManager = LinearLayoutManager(this)
        binding.rvcontacts.adapter = contactsAdapter
    }
}
