package com.parg3v.spacexlaunchtracker.launchTracker.data.di

import com.parg3v.spacexlaunchtracker.launchTracker.data.helper.LaunchTrackerHelper
import com.parg3v.spacexlaunchtracker.launchTracker.data.repository.LaunchTrackerRepositoryImpl
import com.parg3v.spacexlaunchtracker.launchTracker.domain.repository.LaunchTrackerRepository
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val launchTrackerDataModule = module {
    singleOf(::LaunchTrackerHelper)
    singleOf(::LaunchTrackerRepositoryImpl) { bind<LaunchTrackerRepository>() }
}