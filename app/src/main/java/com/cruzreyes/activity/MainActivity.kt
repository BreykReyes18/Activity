package com.cruzreyes.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.cruzreyes.activity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun changeView(view: View){
        val intent = Intent(this, Movie1::class.java)
        startActivity(intent)
    }
    fun changeView2(view: View){
        val intent = Intent(this, Movie2::class.java)
        startActivity(intent)
    }
    fun changeView3(view: View){
        val intent = Intent(this, Movie3::class.java)
        startActivity(intent)
    }
    fun changeView4(view: View){
        val intent = Intent(this, Movie4::class.java)
        startActivity(intent)
    }
}