package com.robertconstantin.plugins

import com.robertconstantin.feature_hereoes.domain.service.IHeroService
import com.robertconstantin.feature_hereoes.presentation.getAllHeroes
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Application.configureRouting() {
    

    val heroService: IHeroService by inject()

    routing {

        getAllHeroes(heroService)



        // Static plugin. Try to access `/static/index.html`
        static("/static") {
            resources("static")
        }
    }
}
