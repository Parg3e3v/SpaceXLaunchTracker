package com.parg3v.spacexlaunchtracker.launchTracker.presentation.viewmodel

import androidx.lifecycle.viewModelScope
import com.parg3v.spacexlaunchtracker.launchTracker.domain.usecase.GetLaunchesUseCase
import com.parg3v.spacexlaunchtracker.launchTracker.presentation.contract.LaunchTrackerContract
import kotlinx.coroutines.launch

class LaunchTrackerViewModel(
    private val getLaunchesUseCase: GetLaunchesUseCase
) : BaseViewModel<LaunchTrackerContract.Event, LaunchTrackerContract.State, LaunchTrackerContract.Effect>() {

    override fun setInitialState(): LaunchTrackerContract.State =
        LaunchTrackerContract.State.INITIAL

    override fun handleEvents(event: LaunchTrackerContract.Event) {
        TODO("Not yet implemented")
    }

    init {
        viewModelScope.launch {
            getLaunches()
        }
    }

    private suspend fun getLaunches() {
        viewModelScope.launch {
            getLaunchesUseCase.invoke().collect { launchLogList ->
                setState { copy(launchLogList = launchLogList) }
            }
        }
    }
}