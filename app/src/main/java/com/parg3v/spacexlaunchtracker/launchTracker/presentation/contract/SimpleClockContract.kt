package com.parg3v.spacexlaunchtracker.launchTracker.presentation.contract

import com.parg3v.spacexlaunchtracker.launchTracker.presentation.viewmodel.ViewEffect
import com.parg3v.spacexlaunchtracker.launchTracker.presentation.viewmodel.ViewEvent
import com.parg3v.spacexlaunchtracker.launchTracker.presentation.viewmodel.ViewState

class SimpleClockContract {
    sealed class Event : ViewEvent {
        data object UpdateTime : Event()
    }

    data class State(val time: Long, val stringFormat: String) : ViewState {
        companion object {
            val INITIAL = State(time = 0, stringFormat = "00:00:00")
        }
    }

    sealed class Effect : ViewEffect {
        data object UpdateTime : Effect()
    }
}