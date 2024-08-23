package com.example.mvvmtodoapp.ui.todo_list

import com.example.mvvmtodoapp.data.Todo

//무슨 이벤트가 발생할지 생각해서 작성
sealed class TodoListEvent {
    data class OnDeleteTodoClick(val todo: Todo) : TodoListEvent()
    data class OnDoneChange(val todo: Todo, val isDone: Boolean) : TodoListEvent()
    object OnUndoDeleteClick:TodoListEvent()
    data class OnTodoClick(val todo: Todo) : TodoListEvent()
    object OnAddTodoClick : TodoListEvent()
}