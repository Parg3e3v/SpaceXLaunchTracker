package com.parg3v.spacexlaunchtracker.launchTracker.presentation.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.parg3v.spacexlaunchtracker.launchTracker.domain.model.LaunchLogDomainModel
import java.time.format.DateTimeFormatter

@Composable
fun LaunchLogItem(modifier: Modifier = Modifier, item: LaunchLogDomainModel) {

    val formatter = DateTimeFormatter.ofPattern("dd.MM.yy")
    val formattedDate = item.date.format(formatter)

    Column(
        modifier = modifier
            .background(Color.LightGray, shape = RoundedCornerShape(20))
            .padding(32.dp),
        verticalArrangement = Arrangement.spacedBy(5.dp)
    ) {
        Text(text = "Mission Name: ${item.missionName}")
        Text(text = "Date: $formattedDate")
        Text(text = "Details: ${item.details}")
        Text(text = "Status: ${item.status}")
    }
}