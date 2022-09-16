package com.example.appauthenticationgoogle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase

class HomeActivity : AppCompatActivity() {

    private lateint var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        auth = FirebaseAuth.getInstance()

        val email = intent.getStringExtra("email")
        val name = intent.getStringExtra("name")

        val emailTextView: TextView = findViewById(R.id.emailTextView)
        val nameTextView: TextView = findViewById(R.id.nameTextView)

        emailTextView.text = email
        nameTextView.text = name

        val
    }
}