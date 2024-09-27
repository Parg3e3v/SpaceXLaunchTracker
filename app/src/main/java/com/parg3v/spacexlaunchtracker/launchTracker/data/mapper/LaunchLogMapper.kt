package com.parg3v.spacexlaunchtracker.launchTracker.data.mapper

import android.os.Build
import androidx.annotation.RequiresApi
import com.parg3v.spacexlaunchtracker.launchTracker.data.model.LaunchLogDataModel
import com.parg3v.spacexlaunchtracker.launchTracker.domain.model.LaunchLogDomainModel
import java.time.LocalDate

@RequiresApi(Build.VERSION_CODES.O)
fun LaunchLogDataModel.toLaunchLogDomain() = LaunchLogDomainModel(
    missionName = missionName,
    date = LocalDate.parse(date),
    details = details,
    status = status
)