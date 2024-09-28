package com.parg3v.spacexlaunchtracker.launchTracker.presentation.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.parg3v.spacexlaunchtracker.launchTracker.presentation.contract.LaunchTrackerContract
import kotlinx.coroutines.flow.Flow

@Composable
fun LaunchTrackerScreen(
    modifier: Modifier = Modifier,
    state: LaunchTrackerContract.State,
    effect: Flow<LaunchTrackerContract.Effect>,
    onEvent: (LaunchTrackerContract.Event) -> Unit,
) {

    Column(modifier = modifier.padding(16.dp)) {
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(items = state.launchLogList) {
                LaunchLogItem(item = it, modifier = Modifier.padding(vertical = 8.dp))
            }
        }
    }
}