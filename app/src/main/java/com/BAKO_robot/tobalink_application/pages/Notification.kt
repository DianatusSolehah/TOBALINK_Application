package com.BAKO_robot.tobalink_application.pages

import android.app.Notification
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.BAKO_robot.tobalink_application.R

@Composable
fun Notification(modifier: Modifier = Modifier){
    val notifications = listOf(
        "Berita terkini seputar perkembangan tanaman tembakau",
        "Login terlebih dahulu untuk dapat membaca berita",
        "Buat password dengan campuran angka dan huruf",
        "Selamat akun anda sudah terdaftar",
        "Halo !!, Hengki Saputra"
    )
    Column (
        modifier = Modifier.fillMaxSize().padding(16.dp)

    ){
        LazyVerticalGrid(
            columns = GridCells.Fixed(1),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(notifications.size){index ->
                ItemNotif(message = notifications[index])
            }
        }
    }
}
@Composable
fun ItemNotif(message: String){
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(Color.LightGray)
            .padding(16.dp)
    ){
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier.size(40.dp).padding(end = 8.dp)
        )
        Text(
            text = message,
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
            modifier = Modifier.weight(1f)
        )

        Button(onClick = {}) {
            Text(text = "Hapus")
        }
    }
}