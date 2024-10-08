package com.parg3v.spacexlaunchtracker.launchTracker.domain.di

import com.parg3v.spacexlaunchtracker.launchTracker.domain.usecase.GetLaunchesUseCase
import com.parg3v.spacexlaunchtracker.launchTracker.domain.usecase.GetLaunchesUseCaseImpl
import com.parg3v.spacexlaunchtracker.launchTracker.domain.usecase.UpdateClockUseCase
import com.parg3v.spacexlaunchtracker.launchTracker.domain.usecase.UpdateClockUseCaseImpl
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

val launchTrackerDomainModule = module {
    factoryOf(::GetLaunchesUseCaseImpl) { bind<GetLaunchesUseCase>() }
    factoryOf(::UpdateClockUseCaseImpl) { bind<UpdateClockUseCase>() }
}