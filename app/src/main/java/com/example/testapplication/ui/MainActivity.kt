package com.example.testapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testapplication.MainViewModel
import com.example.testapplication.adapters.SampleAdapter
import com.example.testapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var sampleAdapter: SampleAdapter
    private var _binding: ActivityMainBinding? = null
    private val binding  get() = _binding!!
    private lateinit var model: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        model = ViewModelProvider(this)[MainViewModel::class.java]
        setContentView(binding.root)
        val data = model.getData()

        sampleAdapter = SampleAdapter()

        binding.rv.apply {
            adapter = sampleAdapter
            layoutManager = LinearLayoutManager(this@MainActivity).apply { orientation = LinearLayoutManager.VERTICAL }
        }

        sampleAdapter.setData(data)

    }
}

//avinash@siterecon.ai