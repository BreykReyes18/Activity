package com.cruzreyes.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.cruzreyes.activity.databinding.ActivityPelicula4Binding

class Movie4 : AppCompatActivity() {
    private lateinit var binding: ActivityPelicula4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPelicula4Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun closeView(view: View){
        finish()
    }
}