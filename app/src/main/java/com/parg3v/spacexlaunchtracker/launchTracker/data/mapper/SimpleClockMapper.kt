package com.parg3v.spacexlaunchtracker.launchTracker.data.mapper

import java.util.Locale

fun Long.timeToStringFormat(): String {
    val hours = (this / 3600) % 24
    val minutes = (this % 3600) / 60
    val remainingSeconds = this % 60

    return String.format(Locale.getDefault(), "%02d:%02d:%02d", hours, minutes, remainingSeconds)
}