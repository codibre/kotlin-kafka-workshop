package org.maxmilhas.kafka_workshop.todo_list_service.entrypoint.http

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/todolist")
class TodoListHttpApi {
    @GetMapping("/create", produces = ["application/json"])
    fun getIndex(): HashMap<String, String> {
        val map = HashMap<String, String>()
        map["result"] = "Todo list created!"
        return map
    }
}
