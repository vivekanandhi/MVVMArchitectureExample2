package com.vivi.mvvmarchitectureexample2.utils

import android.provider.ContactsContract.RawContacts.Data
import java.util.Date

data class Resource<out T>(val status: Status,val data: T?,val message:String?){
    companion object{
        fun <T> success(data: T?):Resource<T>{
            return Resource(Status.SUCCESS, data,null)
        }
        fun <T> error(msg:String,data: T?):Resource<T>{
            return Resource(Status.ERROR,data,msg)
        }
        fun <T> loading(data: T?):Resource<T>{
            return Resource(Status.LOADING,data,null)
        }
    }
}
