package com.vivi.mvvmarchitectureexample2.Data.api

import com.vivi.mvvmarchitectureexample2.Data.model.User
import io.reactivex.Single

interface ApiService {
    fun getUsers():Single<List<User>>
}