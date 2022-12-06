package com.vivi.mvvmarchitectureexample2.Data.repository

import com.vivi.mvvmarchitectureexample2.Data.api.ApiHelper
import com.vivi.mvvmarchitectureexample2.Data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper:ApiHelper) {
    fun getUsers():Single<List<User>>{
        return apiHelper.getUsers()
    }
}