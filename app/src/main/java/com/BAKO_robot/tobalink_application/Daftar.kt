package com.BAKO_robot.tobalink_application

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Daftar(navController: NavController){
    var nama by remember{
        mutableStateOf("")
    }
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        OutlinedTextField(value = nama, onValueChange = {
            nama = it
        }, label = {
            Text(text = "Masukkan nama")
        })
        Spacer(modifier = Modifier.height(15.dp))
        OutlinedTextField(value = email, onValueChange = {
            email = it
        }, label = {
            Text(text = "Masullan email")
        })
        Spacer(modifier = Modifier.height(15.dp))
        OutlinedTextField(value = password, onValueChange = {
            password = it
        }, label = {
            Text(text = "Masukkan password")
        })
        Spacer(modifier = Modifier.height(40.dp))
        Button(onClick = {
            navController.navigate("masuk")
        }) {
            Text(text = "Masuk")
        }
    }
}