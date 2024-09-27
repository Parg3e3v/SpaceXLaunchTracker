package com.parg3v.spacexlaunchtracker.launchTracker.domain.repository

import com.parg3v.spacexlaunchtracker.launchTracker.domain.model.LaunchLogDomainModel
import kotlinx.coroutines.flow.Flow

interface LaunchTrackerRepository {
    suspend fun getLaunches(): Flow<List<LaunchLogDomainModel>>
}