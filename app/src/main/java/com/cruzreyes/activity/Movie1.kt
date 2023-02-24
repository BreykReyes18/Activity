package com.cruzreyes.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.cruzreyes.activity.databinding.Pelicula1Binding

class Movie1 : AppCompatActivity() {

        private lateinit var binding: Pelicula1Binding
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = Pelicula1Binding.inflate(layoutInflater)
            setContentView(binding.root)
        }
        fun closeView(view: View){
            finish()
        }
}