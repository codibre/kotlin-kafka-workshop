package org.maxmilhas.kafka_workshop.todo_list_service

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TodoListServiceApplication

fun main(args: Array<String>) {
    try {
        runApplication<TodoListServiceApplication>(*args)
    } catch (t: Throwable) {
        println(t.message)
        t.printStackTrace()
    }
}
