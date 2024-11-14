package com.BAKO_robot.tobalink_application.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.BAKO_robot.tobalink_application.R

@Composable
fun Profile(modifier: Modifier = Modifier){
    Column (
        modifier = modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
            Image(
                painter = painterResource(id = R.drawable.dian),
                contentDescription = "Profile",
                modifier = Modifier
                    .clip(CircleShape)
                    .size(110.dp)
            )


        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "DIANATUS SOLEHAH", fontSize = 20.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = {}) {
            Text(text = "Edit Profile")
        }

        Spacer(modifier = Modifier.height(16.dp))
        Profilee(text = "sholehahdian09@gmail.com")
        Profilee(text = "Universitas Nurul Jadid")
        Profilee(text = "Teknik Informatika")
        Profilee(text = "Semester VII ")
        Profilee(text = "Bondowoso - Jawa Timur")
    }
}

@Composable
fun Profilee(text: String){
    Card (
        modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp),
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFF5F5F5))
    ){
        Text(
            text = text, modifier = Modifier.padding(16.dp), fontSize = 16.sp, color = Color.Black
        )
    }
}