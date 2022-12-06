package com.vivi.mvvmarchitectureexample2

import android.app.Application
import com.androidnetworking.AndroidNetworking

class MvvmApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        AndroidNetworking.initialize(applicationContext);
    }
}