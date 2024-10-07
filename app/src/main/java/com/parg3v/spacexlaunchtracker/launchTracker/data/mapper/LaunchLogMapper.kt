package com.parg3v.spacexlaunchtracker.launchTracker.data.mapper

import com.parg3v.spacexlaunchtracker.launchTracker.domain.model.LaunchLogDomainModel
import src.main.graphql.LaunchesFetchingQuery
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun LaunchesFetchingQuery.Launch.toDomainModel(): LaunchLogDomainModel {
    val formattedDate = try {
        LocalDateTime.parse(launch_date_local as String, DateTimeFormatter.ISO_DATE_TIME)
            .toLocalDate()
    } catch (e: Exception) {
        throw IllegalArgumentException("Invalid date format: $launch_date_local")
    }

    return LaunchLogDomainModel(missionName = mission_name.orEmpty(),
        date = formattedDate,
        details = details ?: "-",
        status = launch_success?.let { if (launch_success == true) "Launch was successful" else "Launch failed" }
            ?: "Launch status unknown"
    )
}