package com.vivi.mvvmarchitectureexample2.Data.api

class ApiHelper(private val apiService:ApiService) {
    fun getUsers()=apiService.getUsers()
}