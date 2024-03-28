package com.example.icetask1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val LoginButton: Button = findViewById(R.id.LoginButton)
        val UserNameEditText: EditText = findViewById(R.id.UsernameEditText)
        val PasswordEditText: EditText = findViewById(R.id.PasswordEditText)

        LoginButton.setOnClickListener {
            val username = UserNameEditText.text.toString()
            val password = PasswordEditText.text.toString()

            if (username == "admin" && password == "password") {

            }
            //Successful Login
            Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()

            //Login failed
            Toast.makeText(this, "Login failed, Please try again", Toast.LENGTH_SHORT).show()

                    }
        }
}