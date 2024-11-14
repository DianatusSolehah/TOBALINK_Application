package com.BAKO_robot.tobalink_application

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.BAKO_robot.tobalink_application.pages.Home
import com.BAKO_robot.tobalink_application.pages.Notification
import com.BAKO_robot.tobalink_application.pages.Profile

@Composable
fun Screen(modifier: Modifier = Modifier){

    val navItemList = listOf(
        Item("Home", Icons.Default.Home),
        Item("Notification", Icons.Default.Notifications),
        Item("Profile", Icons.Default.Person),
    )
    var selectedIndex by remember {
        mutableIntStateOf(0)
    }
    Scaffold (
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            NavigationBar {
                navItemList.forEachIndexed { index, item ->
                    NavigationBarItem(
                        selected = selectedIndex == index,
                        onClick ={
                            selectedIndex = index
                        },
                        icon = {
                            Icon(imageVector = item.icon, contentDescription = "Icon")
                        },
                        label = {
                            Text(text = item.label)
                        }
                    )
                }
            }
        }
        ){ innerPadding ->
        ContentScreen(modifier = Modifier.padding(innerPadding), selectedIndex)
    }
}

@Composable
fun ContentScreen(modifier: Modifier = Modifier, selectedIndex : Int){
    when(selectedIndex){
        0-> Home()
        1-> Notification()
        2-> Profile()
    }
}