package com.example.plugins

import com.example.models.TicTacToeGame
import com.example.socket
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.configureRouting(game: TicTacToeGame) {

    routing {
        socket(game)
    }
}
