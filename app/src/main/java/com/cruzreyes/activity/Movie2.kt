package com.cruzreyes.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.cruzreyes.activity.databinding.ActivityPelicula2Binding

class Movie2 : AppCompatActivity() {
    private lateinit var binding: ActivityPelicula2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPelicula2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun closeView(view: View){
        finish()
    }
}