package com.robertconstantin.feature_hereoes.domain.service

import com.robertconstantin.feature_hereoes.domain.repository.IHeroRepository

class HeroServiceImpl(
    private val repository: IHeroRepository
): IHeroService {
    override suspend fun getAllHeroes() = repository.getAllHeroes()
}