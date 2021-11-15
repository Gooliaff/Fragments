package com.example.fragmentapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment


class PhotoFragment : Fragment() {

    private lateinit var photoButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_photo2, container, false)

        photoButton = view.findViewById(R.id.photo)

        val photoFragment = PhotoFragment()
        val link = Uri.parse("https://yandex.ru/images/")
        val intent = Intent(Intent.ACTION_VIEW, link)
        photoButton.setOnClickListener {
startActivity(intent)
            //activity?.supportFragmentManager
                //?.beginTransaction()
               // ?.replace(R.id.fragment_container, photoFragment)
               // ?.commit()
        }



        return view
    }


}