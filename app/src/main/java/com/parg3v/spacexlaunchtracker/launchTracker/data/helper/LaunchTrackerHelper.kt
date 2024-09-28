package com.parg3v.spacexlaunchtracker.launchTracker.data.helper

import com.parg3v.spacexlaunchtracker.launchTracker.data.model.LaunchLogDataModel
import kotlinx.coroutines.flow.MutableStateFlow

class LaunchTrackerHelper {

    private val mockData = listOf(
        LaunchLogDataModel(
            missionName = "FalconSat",
            date = "2024-09-06",
            details = "Engine failure at 33 seconds and loss of vehicle",
            status = "Launch was successful"
        ),
        LaunchLogDataModel(
            missionName = "Starlink-12",
            date = "2023-12-18",
            details = "Successful deployment of 60 Starlink satellites into orbit",
            status = "Launch was successful"
        ),
        LaunchLogDataModel(
            missionName = "Falcon 1 Flight 3",
            date = "2008-08-03",
            details = "Engine shut down prematurely and vehicle did not reach orbit",
            status = "Launch failed"
        ),
        LaunchLogDataModel(
            missionName = "Falcon 9 AMOS-6",
            date = "2016-09-01",
            details = "Explosion on the launch pad during fueling destroyed the vehicle",
            status = "Launch failed"
        ),
        LaunchLogDataModel(
            missionName = "Crew Dragon Demo-2",
            date = "2022-05-30",
            details = "First manned mission to the ISS using Crew Dragon",
            status = "Launch was successful"
        )
    )

    private val _studentList: MutableStateFlow<List<LaunchLogDataModel>> =
        MutableStateFlow(mockData)

    fun getStudentList(): MutableStateFlow<List<LaunchLogDataModel>> = _studentList

}