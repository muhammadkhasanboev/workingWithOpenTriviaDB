package com.android.workingwithapi

sealed class Screen(val route: String){
    object Home: Screen(route= "home_screen")
    object Settings: Screen(route="settings_screen")
}