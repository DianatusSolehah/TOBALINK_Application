package com.BAKO_robot.tobalink_application

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.BAKO_robot.tobalink_application.ui.theme.TOBALINK_ApplicationTheme

@Composable
fun Login(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "SELAMAT DATANG", fontSize = 25.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(25.dp))
        Image(
            painter = painterResource(id = R.drawable.logo), contentDescription = "login image",
            modifier = Modifier.size(200.dp)
        )

        Spacer(modifier = Modifier.height(7.dp))
        Text(text = "TOBALINK", fontSize = 10.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(35.dp))
        Button(onClick = {
            navController.navigate("daftar")
        }) {
            Text(text = "Daftar")
        }
    }

}



