package com.parg3v.spacexlaunchtracker

import android.app.Application
import com.parg3v.spacexlaunchtracker.common_data.di.apolloModule
import com.parg3v.spacexlaunchtracker.launchTracker.data.di.launchTrackerDataModule
import com.parg3v.spacexlaunchtracker.launchTracker.domain.di.launchTrackerDomainModule
import com.parg3v.spacexlaunchtracker.launchTracker.presentation.di.launchTrackerPresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class SpaceXLaunchTrackerApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@SpaceXLaunchTrackerApplication)
            modules(
                launchTrackerDataModule,
                launchTrackerDomainModule,
                launchTrackerPresentationModule,
                apolloModule
            )
        }
    }
}