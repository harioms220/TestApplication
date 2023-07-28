package com.example.testapplication.repos

import com.example.testapplication.models.SampleModel
import com.google.gson.Gson
import org.json.JSONObject

class SampleRepoImpl: SampleRepo {
    override fun getApiData(): SampleModel {
        return Gson().fromJson("{\"data\":[\"When well treated, a cat can live twenty or more years but the average life span of a domestic cat is 14 years.\",\"Cats can jump up to six times their length.\",\"Mother cats teach their kittens to use the litter box.\"]}", SampleModel::class.java)
    }
}