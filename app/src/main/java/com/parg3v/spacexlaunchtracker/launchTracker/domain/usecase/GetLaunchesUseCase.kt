package com.parg3v.spacexlaunchtracker.launchTracker.domain.usecase

import com.parg3v.spacexlaunchtracker.launchTracker.domain.model.LaunchLogDomainModel
import com.parg3v.spacexlaunchtracker.launchTracker.domain.repository.LaunchTrackerRepository
import kotlinx.coroutines.flow.Flow

interface GetLaunchesUseCase {
    suspend fun invoke(): Flow<List<LaunchLogDomainModel>>
}

class GetLaunchesUseCaseImpl(private val repository: LaunchTrackerRepository) : GetLaunchesUseCase {

    override suspend fun invoke(): Flow<List<LaunchLogDomainModel>> = repository.getLaunches()

}