package com.example.simplenov14.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.simplenov14.MainViewModel
import com.example.simplenov14.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        initListeners()
    }

    private fun initListeners() = with(binding) {
        btnInteract.setOnClickListener {
            viewModel.getPeople()
            tvDisplay.text = viewModel.people[0].name
        }
    }
}