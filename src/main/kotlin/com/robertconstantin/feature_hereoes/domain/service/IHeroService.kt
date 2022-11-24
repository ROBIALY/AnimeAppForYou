package com.robertconstantin.feature_hereoes.domain.service

import com.robertconstantin.feature_hereoes.domain.model.HeroDM

interface IHeroService {
    suspend fun getAllHeroes(): List<HeroDM>
}