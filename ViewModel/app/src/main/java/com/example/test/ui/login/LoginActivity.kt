package com.example.test.ui.login

import android.app.Activity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.Toast
import androidx.activity.viewModels
import com.example.test.databinding.ActivityLoginBinding

import com.example.test.R

class LoginActivity : AppCompatActivity() {

    private lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val factory = MyViewModelFactory(10)
        loginViewModel = factory.create(LoginViewModel::class.java)
        loginViewModel.isUserLoggedIn.observe(this, Observer<Boolean> {
            if (it == false){

            }
            else {

            }
        })

        loginViewModel.login()
    }



}