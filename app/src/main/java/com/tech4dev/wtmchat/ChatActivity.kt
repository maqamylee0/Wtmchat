package com.tech4dev.wtmchat

import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.tech4dev.wmtchat.adapter.ChatsAdapter

class ChatActivity : AppCompatActivity() {
    private lateinit var toolbar: Toolbar
    private lateinit var messageRecyclerView: RecyclerView
    private lateinit var messageTyped: EditText
    private lateinit var sendButton: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        val userName: String = intent.getStringExtra("USER") ?: ""

        setupToolbar(userName)
        setupChatRecyclerview(userName)

        messageTyped = findViewById(R.id.message)
        sendButton = findViewById(R.id.send_button)

        sendButton.setOnClickListener{
            val userInput: String = messageTyped.text.toString() ?: ""
            Toast.makeText(this, userInput, Toast.LENGTH_LONG).show()
        }

    }
    private fun setupChatRecyclerview(userName: String) {
        messageRecyclerView = findViewById(R.id.messageRV)
        messageRecyclerView.layoutManager = LinearLayoutManager(this)
        messageRecyclerView.adapter = ChatsAdapter(this, userName)
    }

    private fun setupToolbar(username:String) {
        toolbar = findViewById(R.id.toolbar2)
        setSupportActionBar(toolbar)
        supportActionBar?.title = username
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}