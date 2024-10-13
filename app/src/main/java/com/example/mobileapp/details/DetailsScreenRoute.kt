package com.example.mobileapp.details

import com.example.mobileapp.navigation.Route
import kotlinx.serialization.Serializable

@Serializable
data class DetailsScreenRoute(
    val id: Long
) : Route