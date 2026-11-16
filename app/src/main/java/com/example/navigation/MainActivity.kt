package com.example.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.navigation.ui.theme.NavigationTheme
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavigationTheme {
                BasicNavigationApp()
            }
        }
    }
}

@Composable
fun BasicNavigationApp() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Routes.Home.route
    ) {
// Layar Home
        composable(Routes.Home.route) {
            HomeScreen(navController)
        }
// Layar Profile
        composable(Routes.Profile.route) {
            ProfileScreen(navController)
        }
// Layar Detail
        composable(Routes.Detail.route) {
            DetailScreen(navController)
        }
    }
}