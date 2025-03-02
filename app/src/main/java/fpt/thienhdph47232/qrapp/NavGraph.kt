package fpt.thienhdph47232.qrapp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login") {
        composable("signup") { SignUpScreen(navController) }
        composable("login") { LoginScreen(navController) }

    }
}