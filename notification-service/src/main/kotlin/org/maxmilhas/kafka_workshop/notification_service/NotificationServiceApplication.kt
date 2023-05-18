package org.maxmilhas.kafka_workshop.notification_service

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NotificationServiceApplication

fun main(args: Array<String>) {
    try {
        runApplication<NotificationServiceApplication>(*args)
    } catch (t: Throwable) {
        println(t.message)
        t.printStackTrace()
    }
}
