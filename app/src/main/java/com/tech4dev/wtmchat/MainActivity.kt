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
        menuInflater.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.search ->{
                Toast.makeText(this,"Search Clicked",Toast.LENGTH_LONG).show()
                return true
            }
            R.id.new_group ->{
                Toast.makeText(this,"New Group clicked",Toast.LENGTH_LONG).show()
                goToNewGroup()
                return true
            }
            R.id.new_broadcast ->{
                Toast.makeText(this,"New Broadcast clicked",Toast.LENGTH_LONG).show()
                return true
            }
            R.id.linked_devices ->{
                Toast.makeText(this,"Linked devices clicked",Toast.LENGTH_LONG).show()
                return true
            }
            R.id.starred_messages ->{
                Toast.makeText(this,"Starred messages Clicked",Toast.LENGTH_LONG).show()
                return true
            }
            R.id.settings ->{
                Toast.makeText(this,"Settings Clicked",Toast.LENGTH_LONG).show()
                return true
            }
            else ->{
                return false
            }
        }
        return true
    }
    private  fun goToNewGroup(){
        val intent = Intent(this,NewGroupActivity::class.java)
        startActivity(intent)

    }
}