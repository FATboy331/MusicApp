package com.geektech.musicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geektech.musicapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        if (savedInstanceState == null) {

            supportFragmentManager.beginTransaction()
                .add(binding.container.id, ImageFragment()).commit()

        }

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(binding.container.id, MusicFragment()).commit()
        }
    }










}