package com.parg3v.spacexlaunchtracker.launchTracker.data.repository

import android.os.Build
import androidx.annotation.RequiresApi
import com.parg3v.spacexlaunchtracker.launchTracker.data.helper.LaunchTrackerHelper
import com.parg3v.spacexlaunchtracker.launchTracker.data.mapper.toLaunchLogDomain
import com.parg3v.spacexlaunchtracker.launchTracker.domain.model.LaunchLogDomainModel
import com.parg3v.spacexlaunchtracker.launchTracker.domain.repository.LaunchTrackerRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.withContext

class LaunchTrackerRepositoryImpl(private val launchTrackerHelper: LaunchTrackerHelper) : LaunchTrackerRepository {
    @RequiresApi(Build.VERSION_CODES.O)
    override suspend fun getLaunches(): Flow<List<LaunchLogDomainModel>> =
        withContext(context = Dispatchers.IO){
            launchTrackerHelper.getStudentList().map { it.map { it.toLaunchLogDomain() } }
        }
}