package tech.mrtuxa

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import tech.mrtuxa.plugins.configureMonitoring
import tech.mrtuxa.plugins.configureRouting
import tech.mrtuxa.plugins.configureTemplating

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    configureMonitoring()
    configureTemplating()
    configureRouting()
}
