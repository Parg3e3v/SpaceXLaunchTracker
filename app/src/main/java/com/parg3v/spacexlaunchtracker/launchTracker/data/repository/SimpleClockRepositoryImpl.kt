package com.parg3v.spacexlaunchtracker.launchTracker.data.repository

import com.parg3v.spacexlaunchtracker.launchTracker.data.helper.SimpleClockHelper
import com.parg3v.spacexlaunchtracker.launchTracker.domain.repository.SimpleClockRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext

class SimpleClockRepositoryImpl(private val simpleClockHelper: SimpleClockHelper) :
    SimpleClockRepository {
    override suspend fun getTime(): Flow<Long> =
        withContext(context = Dispatchers.IO) {
            simpleClockHelper.getTime()
        }

}