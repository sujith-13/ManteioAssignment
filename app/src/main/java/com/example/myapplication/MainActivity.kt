package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val arr = resources.getStringArray(R.array.list)
       val categorySpinner = findViewById<Spinner>(R.id.category_spinner)
        ArrayAdapter.createFromResource(
            this, R.array.list, android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            categorySpinner.adapter = adapter
        }
        val assignedSpinner = findViewById<Spinner>(R.id.assignedto_spinner)
        ArrayAdapter.createFromResource(
            this, R.array.list, android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            assignedSpinner.adapter = adapter
        }
        val notifySpinner = findViewById<Spinner>(R.id.assigned_spinner)
        ArrayAdapter.createFromResource(
            this, R.array.list, android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            notifySpinner.adapter = adapter
        }
        val btn=findViewById<Button>(R.id.button2)
        btn.setOnClickListener {
            val intent= Intent(this,ComplaintDetailActivity::class.java)
            startActivity(intent)
        }
    }
}
