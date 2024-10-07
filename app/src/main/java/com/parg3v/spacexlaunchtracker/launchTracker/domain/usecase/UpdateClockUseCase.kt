package com.parg3v.spacexlaunchtracker.launchTracker.domain.usecase

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.util.Locale

interface UpdateClockUseCase {
    suspend fun invoke(currentTime: Long): Flow<String>
}

class UpdateClockUseCaseImpl :
    UpdateClockUseCase {

    override suspend fun invoke(currentTime: Long): Flow<String> = flow {
        var time = currentTime
        while (true) {
            delay(1000)
            time += 1
            val hours = (time / 3600) % 24
            val minutes = (time % 3600) / 60
            val remainingSeconds = time % 60

            emit(
                String.format(
                    Locale.getDefault(),
                    "%02d:%02d:%02d",
                    hours,
                    minutes,
                    remainingSeconds
                )
            )
        }
    }

}