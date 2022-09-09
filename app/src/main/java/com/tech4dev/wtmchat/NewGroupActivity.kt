package com.tech4dev.wtmchat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.tech4dev.wtmchat.R

class NewGroupActivity : AppCompatActivity() {
    private lateinit var toolbar: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_group)

        toolbar = findViewById(R.id.toolbar3)
        setSupportActionBar(toolbar)
    }
}