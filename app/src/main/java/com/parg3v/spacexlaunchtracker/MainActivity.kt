package com.parg3v.spacexlaunchtracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.parg3v.spacexlaunchtracker.common_presentation.theme.SpaceXLaunchTrackerTheme
import com.parg3v.spacexlaunchtracker.launchTracker.presentation.screen.LaunchTrackerScreen
import com.parg3v.spacexlaunchtracker.launchTracker.presentation.viewmodel.LaunchTrackerViewModel
import org.koin.androidx.compose.getViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SpaceXLaunchTrackerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    val viewModel: LaunchTrackerViewModel = getViewModel()

                    LaunchTrackerScreen(
                        modifier = Modifier.padding(innerPadding),
                        launchTrackerState = viewModel.viewState.value,
                        effect = viewModel.effect,
                        onEventClock = viewModel::setEvent
                    )
                }
            }
        }
    }
}