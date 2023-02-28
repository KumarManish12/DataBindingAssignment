package com.example.databindingassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.databindingassignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    var number = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.number = number
        binding.activity = this

    }
    fun     onchangeclick() {
        number++
        binding.number = number
    }
    fun     onMinusclick() {

        number--
        binding.number=number
    }
    fun     onResetclick() {

        number=0
        binding.number=number
    }
}