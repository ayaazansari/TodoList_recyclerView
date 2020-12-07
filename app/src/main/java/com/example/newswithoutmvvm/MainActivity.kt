package com.example.newswithoutmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_todo.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var todoList = mutableListOf(
            Todo("hehe",false))

        val todoAdapter = TodoAdapter(todoList)
        rvTodos.adapter = todoAdapter
        rvTodos.layoutManager = LinearLayoutManager(this)

        btnAddTodo.setOnClickListener {
            val title = editText.text.toString()
            val todo= Todo(title,false)
            todoList.add(todo)
            todoAdapter.notifyDataSetChanged()
        }
    }

}