package com.example.mycontactsactivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactsRvAdapter (var contactList:List<Contacts>):
        RecyclerView.Adapter<ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item,parent,false)
        return ContactsViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var CurrentContact=contactList.get(position)
        holder.tvname.text=CurrentContact.name
        holder.tvemail.text=CurrentContact.name
        holder.tvnumber.text=CurrentContact.name
        holder.tvname.text=CurrentContact.name


    }

    override fun getItemCount(): Int {
        return contactList.size

    }

}




class ContactsViewHolder(itemView:View):
  RecyclerView.ViewHolder(itemView) {
    var tvname = itemView.findViewById<TextView>(R.id.tvname)
    var tvemail = itemView.findViewById<TextView>(R.id.tvemail)
    var tvnumber = itemView.findViewById<TextView>(R.id.tvnumber)
    var tvaddress = itemView.findViewById<TextView>(R.id.tvaddress)


}