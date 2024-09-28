package com.parg3v.spacexlaunchtracker.launchTracker.domain.usecase

import com.parg3v.spacexlaunchtracker.launchTracker.domain.repository.SimpleClockRepository
import kotlinx.coroutines.flow.Flow

interface GetClockValueUseCase {
    suspend fun invoke(): Flow<Long>
}

class GetClockValueUseCaseImpl(private val repository: SimpleClockRepository) :
    GetClockValueUseCase {

    override suspend fun invoke(): Flow<Long> = repository.getTime()

}