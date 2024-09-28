package com.parg3v.spacexlaunchtracker.launchTracker.data.helper

import kotlinx.coroutines.flow.MutableStateFlow
import java.time.LocalTime

class SimpleClockHelper {

    private val _time: MutableStateFlow<Long> =
        MutableStateFlow(LocalTime.now().toSecondOfDay().toLong())

    fun getTime(): MutableStateFlow<Long> = _time

}