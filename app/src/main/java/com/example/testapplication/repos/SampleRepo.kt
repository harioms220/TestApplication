package com.example.testapplication.repos

import com.example.testapplication.models.SampleModel

interface SampleRepo {

    fun getApiData(): SampleModel
}