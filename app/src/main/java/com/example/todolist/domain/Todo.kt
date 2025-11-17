package com.example.todolist.domain

public data class Todo(
    val id: Long,
    val title: String,
    val description: String?,
    val isCompleted: Boolean
)

// Mock-Ups
val todo1 = Todo(1, "Tarefa 1", "Descrição da Todo 1", false)
val todo2 = Todo(2, "Tarefa 2", "Descrição da Todo 2", true)
val todo3 = Todo(3, "Tarefa 3", "Descrição da Todo 3", false)