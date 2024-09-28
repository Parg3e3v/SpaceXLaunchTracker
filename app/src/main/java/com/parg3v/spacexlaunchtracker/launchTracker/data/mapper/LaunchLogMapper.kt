package com.parg3v.spacexlaunchtracker.launchTracker.data.mapper

import com.parg3v.spacexlaunchtracker.launchTracker.data.model.LaunchLogDataModel
import com.parg3v.spacexlaunchtracker.launchTracker.domain.model.LaunchLogDomainModel
import java.time.LocalDate

fun LaunchLogDataModel.toLaunchLogDomain() = LaunchLogDomainModel(
    missionName = missionName,
    date = LocalDate.parse(date),
    details = details,
    status = status
)