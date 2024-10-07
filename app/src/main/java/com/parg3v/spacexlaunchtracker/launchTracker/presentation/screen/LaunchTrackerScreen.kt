package com.parg3v.spacexlaunchtracker.launchTracker.presentation.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.parg3v.spacexlaunchtracker.launchTracker.presentation.contract.LaunchTrackerContract
import kotlinx.coroutines.flow.Flow

@Composable
fun LaunchTrackerScreen(
    modifier: Modifier = Modifier,
    launchTrackerState: LaunchTrackerContract.State,
    effect: Flow<LaunchTrackerContract.Effect>,
    onEventClock: (LaunchTrackerContract.Event) -> Unit,
) {


    LazyColumn(
        modifier = modifier
            .padding(16.dp)
            .fillMaxSize()
    ) {
        item {
            Text(
                text = launchTrackerState.clock,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 50.dp),
                textAlign = TextAlign.Center,
                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 70.sp)
            )
        }
        items(items = launchTrackerState.launchLogList) {
            LaunchLogItem(item = it, modifier = Modifier.padding(vertical = 8.dp))
        }
    }

}