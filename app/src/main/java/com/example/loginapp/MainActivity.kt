package com.example.loginapp

import android.os.Bundle
import android.util.Log
import android.util.Log.*
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var usernameInput:EditText
    lateinit var passwordInput:EditText
    lateinit var loginBtn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        usernameInput=findViewById(R.id.username_input)
        passwordInput=findViewById(R.id.password_input)
        loginBtn=findViewById(R.id.login_button)
        loginBtn.setOnClickListener{
            val username=usernameInput.text.toString()
            val password=passwordInput.text.toString()
            val tag = null;
            Log.i(tag,"Test Credentials,Username:$username and Password:$password")
        }



        }
    }