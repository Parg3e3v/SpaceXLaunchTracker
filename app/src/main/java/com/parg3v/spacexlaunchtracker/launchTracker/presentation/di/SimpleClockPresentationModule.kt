package com.parg3v.spacexlaunchtracker.launchTracker.presentation.di

import com.parg3v.spacexlaunchtracker.launchTracker.presentation.viewmodel.SimpleClockViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val simpleClockPresentationModule = module {
    viewModelOf(::SimpleClockViewModel)
}