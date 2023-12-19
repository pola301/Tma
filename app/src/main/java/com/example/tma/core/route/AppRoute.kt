package com.example.tma.core.route

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.tma.module.detail.presentation.DetailScreen
import com.example.tma.module.home.model.Card
import com.example.tma.module.home.model.monumentsNearYou
import com.example.tma.module.home.presentation.HomeScreen

object AppRoute {

    @Composable
    fun GenerateRoute(navController: NavHostController) {
        NavHost(
            navController = navController,
            startDestination = AppRouteName.Home,
        ) {
            composable(AppRouteName.Home) {
                HomeScreen(navController = navController)
            }
            composable("${AppRouteName.Detail}/{id}") { backStackEntry ->
                val id = backStackEntry.arguments?.getString("id")
                val card = monumentsNearYou.first{ it.id == id }

                DetailScreen(navController = navController, card)
            }
        }
    }
}