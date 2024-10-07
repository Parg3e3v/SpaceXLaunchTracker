package com.parg3v.spacexlaunchtracker.launchTracker.presentation.contract

import com.parg3v.spacexlaunchtracker.launchTracker.domain.model.LaunchLogDomainModel
import com.parg3v.spacexlaunchtracker.launchTracker.presentation.viewmodel.ViewEffect
import com.parg3v.spacexlaunchtracker.launchTracker.presentation.viewmodel.ViewEvent
import com.parg3v.spacexlaunchtracker.launchTracker.presentation.viewmodel.ViewState

class LaunchTrackerContract {
    sealed class Event : ViewEvent {
        // empty
    }

    data class State(val launchLogList: List<LaunchLogDomainModel>, val clock: String) : ViewState {
        companion object {
            val INITIAL = State(
                launchLogList = emptyList(),
                clock = "00:00:00"
            )
        }
    }

    sealed class Effect : ViewEffect {
        // empty
    }
}