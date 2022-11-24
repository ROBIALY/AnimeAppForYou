package com.robertconstantin.feature_hereoes.presentation.mapper

import com.robertconstantin.feature_hereoes.domain.model.HeroDM
import com.robertconstantin.feature_hereoes.presentation.model.Hero

fun HeroDM.toHero() = Hero(
    id = this.id, name, image, about, rating, power, month, day, family, abilities, natureTypes
)