package com.example.test.ui.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel(var test:Int) : ViewModel() {

    val isUserLoggedIn:MutableLiveData<Boolean> = MutableLiveData()

    init {
        test = 1
        isUserLoggedIn.value = false
    }

    fun login() {
     isUserLoggedIn.value = true
    }

    fun logout(){
      isUserLoggedIn.value = false
    }
}