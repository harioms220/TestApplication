package com.example.testapplication

import androidx.lifecycle.ViewModel
import com.example.testapplication.models.SampleModel
import com.example.testapplication.repos.SampleRepo
import com.example.testapplication.repos.SampleRepoImpl

class MainViewModel: ViewModel() {

    var repo: SampleRepo = SampleRepoImpl()

    fun getData(): List<String>{
        return repo.getApiData().data
    }
}