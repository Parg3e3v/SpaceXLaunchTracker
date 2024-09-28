package com.parg3v.spacexlaunchtracker.launchTracker.domain.repository

import kotlinx.coroutines.flow.Flow

interface SimpleClockRepository {
    suspend fun getTime(): Flow<Long>
}