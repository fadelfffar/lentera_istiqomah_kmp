package com.example.lentera_istiqomah_kmp

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.runtime.*
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.lentera_istiqomah_kmp.screens.home.HomeScreen
import com.example.lentera_istiqomah_kmp.screens.ramadan.RamadanScreen
import com.example.lentera_istiqomah_kmp.screens.schedule.ScheduleScreen
import com.example.lentera_istiqomah_kmp.screens.settings.SettingsScreen
import com.example.lentera_istiqomah_kmp.utils.Constants
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    val navController = rememberNavController()

    androidx.compose.material3.Scaffold(
        // TODO: figure out why changing Scaffold background color using containerColor does not work
//        containerColor = Color(0xff359D59),
        contentColor = Color(0xff359D59),
        topBar = {
            MainTopAppBar()
        },
        bottomBar = {
            BottomNavBar(navController = navController)
        },
        content = { padding ->
            // Nav host: where screens are placed
            NavHostContainer(navController = navController, padding = padding)
        }
    )
}

@Composable
fun NavHostContainer(
    navController: NavHostController,
    padding: PaddingValues
) {

    NavHost(
        navController = navController,

        // set the start destination as home
        startDestination = "home",

        // Set the padding provided by scaffold
        modifier = Modifier.padding(paddingValues = padding),

        builder = {

            // route : Home
            composable("home") {
                HomeScreen()
            }

            // route : Schedule
            composable("schedule") {
                ScheduleScreen()
            }

            // route : Settings
            composable("settings") {
                SettingsScreen()
            }

            // route : Ramadan
            composable("ramadan") {
                RamadanScreen()
            }
        })
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomNavBar(navController: NavHostController) {
    NavigationBar(

        // set background color
        containerColor = Color(0xff1A7149)) {
//        0xffF9FCF2
        // observe the backstack
        val navBackStackEntry by navController.currentBackStackEntryAsState()

        // observe current route to change the icon
        // color,label color when navigated
        val currentRoute = navBackStackEntry?.destination?.route

        // Bottom nav items we declared
        Constants.BottomNavItems.forEach { navItem ->

            // Place the bottom nav items
            NavigationBarItem(

                // it currentRoute is equal then its selected route
                selected = currentRoute == navItem.route,

                // navigate on click
                onClick = {
                    navController.navigate(navItem.route)
                },

                // Icon of navItem
                icon = {
                    Icon(imageVector = navItem.icon, contentDescription = navItem.label)
                },

                // label
                label = {
                    Text(text = navItem.label)
                },
                alwaysShowLabel = false,

                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color.White, // Icon color when selected
                    unselectedIconColor = Color(0xff359D59), // Icon color when not selected
                    selectedTextColor = Color.White, // Label color when selected
                    indicatorColor = Color(0xFF195334) // Highlight color for selected item
                )
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTopAppBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            Row {
                Text(
                    "Lentera Istiqomah",
                    style = MaterialTheme.typography.body1,
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
        },
        modifier = modifier
    )
}