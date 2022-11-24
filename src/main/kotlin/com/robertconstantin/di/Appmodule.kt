package com.robertconstantin.di

import com.robertconstantin.feature_hereoes.data.HeroList
import com.robertconstantin.feature_hereoes.data.datasource.LocalListDataSourceImpl
import com.robertconstantin.feature_hereoes.data.datasource.interfaces.ILocalListDatasource
import com.robertconstantin.feature_hereoes.data.repository.HeroRepositoryImpl
import com.robertconstantin.feature_hereoes.domain.repository.IHeroRepository
import com.robertconstantin.feature_hereoes.domain.service.HeroServiceImpl
import com.robertconstantin.feature_hereoes.domain.service.IHeroService
import org.koin.dsl.module

val appModule = module {

    single<HeroList> { HeroList }

    single<ILocalListDatasource> {
        LocalListDataSourceImpl(get())
    }

    single<IHeroRepository> {
        HeroRepositoryImpl(get())
    }

    single<IHeroService> { HeroServiceImpl(get()) }
}