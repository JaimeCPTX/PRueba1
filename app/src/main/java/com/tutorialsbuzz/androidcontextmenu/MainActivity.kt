package com.tutorialsbuzz.androidcontextmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        registerForContextMenu(btn)

    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)

        menu?.setHeaderTitle("Context Menu Header")
        menuInflater.inflate(R.menu.context_menu, menu)

    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {

            R.id.action_item2 -> {
                // handing on click of item with id action_item2
                Toast.makeText(this@MainActivity, "item2", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.action_item3 -> {
                // handing on click of item with id action_item3
                Toast.makeText(this@MainActivity, "item3", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.action_item4 -> {
                // handing on click of item with id action_item4
                Toast.makeText(this@MainActivity, "item4", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.action_sub_item1 -> {
                // handing on click of item with id action_item4
                Toast.makeText(this@MainActivity, "sub item1", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.action_sub_item2 -> {
                // handing on click of item with id action_item4
                Toast.makeText(this@MainActivity, "sub item2", Toast.LENGTH_SHORT).show()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }

}
