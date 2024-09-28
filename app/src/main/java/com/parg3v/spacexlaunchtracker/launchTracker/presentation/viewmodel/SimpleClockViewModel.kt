package com.parg3v.spacexlaunchtracker.launchTracker.presentation.viewmodel

import androidx.lifecycle.viewModelScope
import com.parg3v.spacexlaunchtracker.launchTracker.data.mapper.timeToStringFormat
import com.parg3v.spacexlaunchtracker.launchTracker.domain.usecase.GetClockValueUseCase
import com.parg3v.spacexlaunchtracker.launchTracker.presentation.contract.SimpleClockContract
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SimpleClockViewModel(
    private val getClockValueUseCase: GetClockValueUseCase,
) : BaseViewModel<SimpleClockContract.Event, SimpleClockContract.State, SimpleClockContract.Effect>() {

    override fun handleEvents(event: SimpleClockContract.Event) {
        when (event) {
            SimpleClockContract.Event.UpdateTime -> {
                setState { copy(time = time + 1, stringFormat = (time + 1).timeToStringFormat()) }
            }
        }
    }

    init {
        viewModelScope.launch {
            getTime()
            updateTime()
        }
    }

    private fun updateTime() {
        viewModelScope.launch {
            while (true) {
                delay(1000)
                setEffect { SimpleClockContract.Effect.UpdateTime }
            }
        }
    }

    private fun getTime(){
        viewModelScope.launch {
            getClockValueUseCase.invoke().collect { time ->
                setState { copy(time = time, stringFormat = time.timeToStringFormat()) }
            }
        }
    }

    override fun setInitialState(): SimpleClockContract.State = SimpleClockContract.State.INITIAL
}