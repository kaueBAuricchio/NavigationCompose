package com.example.navigationcompose.navigation.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.navigationcompose.navigation.AUTHENTICATION_ROUTE
import com.example.navigationcompose.navigation.Screen
import com.example.navigationcompose.screens.LoginScreen
import com.example.navigationcompose.screens.SignUpScreen

fun NavGraphBuilder.authNavGraph(navController: NavHostController){
    navigation(
        startDestination = Screen.Login.route,
        route = AUTHENTICATION_ROUTE
    ){

        composable(route = Screen.Login.route){
            LoginScreen(navController = navController)
        }

        composable(route = Screen.SignUp.route){
            SignUpScreen(navController = navController)
        }
    }
}