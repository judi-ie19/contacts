package com.example.mycontactsactivity

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.mycontactsactivity.databinding.ContactListItemBinding
import com.example.mycontactsactivity.databinding.ContactsListBinding
import com.squareup.picasso.Picasso

class ContactsRvAdapter (var contactList:List<Contacts>):
        RecyclerView.Adapter<ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var binding=ContactListItemBinding
            .inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactsViewHolder(binding)

    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var CurrentContact=contactList.get(position)
        holder.binding.tvname.text=CurrentContact.name
        holder.binding.tvemail.text=CurrentContact.email
        holder.binding.tvphonenumber.text=CurrentContact.phonenumber
        holder.binding.tvname.text=CurrentContact.name
        Picasso.get().load(CurrentContact.image).resize(300,300).centerCrop().placeholder(R.drawable.ic_baseline_person_24).into(holder.binding.ivContacts)

        val context=holder.itemView.context
        holder.binding.ivContacts.setOnClickListener{
         Toast.makeText(context,"You have clicked the image",Toast.LENGTH_SHORT).show()


        }
        holder.binding.cvcontacts.setOnClickListener {
            val intent=Intent(context,ViewContact::class.java)
            intent.putExtra("NAME",CurrentContact.name)
            intent.putExtra("ADDRESS",CurrentContact.address)
            intent.putExtra("IMAGE",CurrentContact.image)
            context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return contactList.size

    }

}




class ContactsViewHolder(val binding: ContactListItemBinding):
  RecyclerView.ViewHolder(binding.root) {


}