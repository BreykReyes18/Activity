package com.cruzreyes.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.cruzreyes.activity.databinding.ActivityPelicula3Binding

class Movie3 : AppCompatActivity() {
    private lateinit var binding: ActivityPelicula3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPelicula3Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun closeView(view: View){
        finish()
    }
}