package com.parg3v.spacexlaunchtracker.launchTracker.domain.model

import java.time.LocalDate

data class LaunchLogDomainModel(
    val missionName: String,
    val date: LocalDate,
    val details: String,
    val status: String
)