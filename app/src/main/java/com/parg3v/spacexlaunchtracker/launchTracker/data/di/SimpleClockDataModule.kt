package com.parg3v.spacexlaunchtracker.launchTracker.data.di

import com.parg3v.spacexlaunchtracker.launchTracker.data.helper.SimpleClockHelper
import com.parg3v.spacexlaunchtracker.launchTracker.data.repository.SimpleClockRepositoryImpl
import com.parg3v.spacexlaunchtracker.launchTracker.domain.repository.SimpleClockRepository
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val simpleClockDataModule = module {
    singleOf(::SimpleClockHelper)
    singleOf(::SimpleClockRepositoryImpl) { bind<SimpleClockRepository>() }
}