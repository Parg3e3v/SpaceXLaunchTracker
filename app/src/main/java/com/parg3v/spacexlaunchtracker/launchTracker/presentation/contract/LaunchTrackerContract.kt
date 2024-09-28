package com.parg3v.spacexlaunchtracker.launchTracker.presentation.contract

import com.parg3v.spacexlaunchtracker.launchTracker.domain.model.LaunchLogDomainModel
import com.parg3v.spacexlaunchtracker.launchTracker.presentation.viewmodel.ViewEffect
import com.parg3v.spacexlaunchtracker.launchTracker.presentation.viewmodel.ViewEvent
import com.parg3v.spacexlaunchtracker.launchTracker.presentation.viewmodel.ViewState

class LaunchTrackerContract {
    sealed class Event : ViewEvent {
        // empty
    }

    data class State(val launchLogList: List<LaunchLogDomainModel>) : ViewState {
        companion object {
            val INITIAL = State(
                launchLogList = emptyList()
            )
        }
    }

    sealed class Effect : ViewEffect {
        // empty
    }
}