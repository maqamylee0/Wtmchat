package com.tech4dev.wtmchat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.search -> {
                Toast.makeText(this, "Search click", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.new_group ->{
                goToNewGroupActivity()
                return true
            }
            R.id.new_broadcast ->{
                goToNewGroupBroadcast()
                return true
            }
            R.id.linked_devices -> {
                Toast.makeText(this, "Linked Devices click", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.settings ->{
                Toast.makeText(this, "Settings click", Toast.LENGTH_LONG).show()
                return true
            }
            else -> {
                return false
            }
        }
    }

    private fun goToNewGroupActivity(){
        val i = Intent(this, NewGroupActivity::class.java)
        startActivity(i)
    }
    private fun goToNewGroupBroadcast(){
        val i = Intent(this, NewBroadcastActivity::class.java)
        startActivity(i)
    }
}