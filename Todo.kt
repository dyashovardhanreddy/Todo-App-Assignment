package com.application.todo

import java.time.Instant
import java.util.Date

data class Todo(
    var id: Int,
    var title : String,
    var createdAt : Date
)

