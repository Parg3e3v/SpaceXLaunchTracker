package com.parg3v.spacexlaunchtracker.launchTracker.domain.di

import com.parg3v.spacexlaunchtracker.launchTracker.domain.usecase.GetClockValueUseCase
import com.parg3v.spacexlaunchtracker.launchTracker.domain.usecase.GetClockValueUseCaseImpl
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

val simpleClockDomainModule = module {
    factoryOf(::GetClockValueUseCaseImpl) { bind<GetClockValueUseCase>() }
}