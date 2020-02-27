package com.example.tablelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableRow
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        add.setOnClickListener { v ->

            val versionNew = TextView(this)
            versionNew.text = version.text.toString()
            val nameNew = TextView(this)
            nameNew.text = name.text.toString()

            var newRow = TableRow(applicationContext)
            val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
            newRow.setLayoutParams(layoutParams)

            newRow.addView(versionNew , 0)
            newRow.addView(nameNew , 1)
            table.addView(newRow)
        }

    }
}
