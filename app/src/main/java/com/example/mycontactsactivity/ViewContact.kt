package com.example.mycontactsactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mycontactsactivity.databinding.ActivityViewContactBinding
import com.squareup.picasso.Picasso

class ViewContact : AppCompatActivity() {
    lateinit var binding:ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
    }
    fun getExtras(){
        var name=intent.extras?.getString("NAME")
        var address=intent.extras?.getString("ADDRESS")
        var email=intent.extras?.getString("EMAIL")
        var number=intent.extras?.getString("NUMBER")
        var image=binding.ivperson
        Toast.makeText(this,name,Toast.LENGTH_LONG).show()

        binding.tvName.text=name



        Picasso.get().load(intent.getStringExtra("IMAGE")).resize(200,200).centerCrop().into(binding.ivperson)




    }
}