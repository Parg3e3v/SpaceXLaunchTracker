package com.parg3v.spacexlaunchtracker.launchTracker.data.repository

import com.apollographql.apollo.ApolloClient
import com.apollographql.apollo.api.Optional
import com.parg3v.spacexlaunchtracker.common_data.util.LAUNCHES_LIMIT
import com.parg3v.spacexlaunchtracker.launchTracker.data.mapper.toDomainModel
import com.parg3v.spacexlaunchtracker.launchTracker.domain.model.LaunchLogDomainModel
import com.parg3v.spacexlaunchtracker.launchTracker.domain.repository.LaunchTrackerRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import src.main.graphql.LaunchesFetchingQuery

class LaunchTrackerRepositoryImpl(private val apolloClient: ApolloClient) :
    LaunchTrackerRepository {

    override suspend fun getLaunches(): Flow<List<LaunchLogDomainModel>> = flow {
        val response =
            apolloClient.query(LaunchesFetchingQuery(Optional.presentIfNotNull(LAUNCHES_LIMIT)))
                .execute()
        val launches = response.data?.launches?.mapNotNull { it?.toDomainModel() } ?: emptyList()
        emit(launches)
    }.flowOn(Dispatchers.IO)
}