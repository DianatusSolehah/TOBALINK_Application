package com.BAKO_robot.tobalink_application.pages

import android.app.LauncherActivity.ListItem
import android.inputmethodservice.Keyboard.Row
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.BAKO_robot.tobalink_application.R

@Composable
fun Home(modifier: Modifier = Modifier){
    Column (
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var mylist1 = getAllDataLazys2()
        LazyRow (content = {
            itemsIndexed(mylist1, itemContent = {index, item ->
                DataItemRow(item = item)
            })
        })

        var mylist = getAllDataLazys()
        LazyColumn (content = {
            itemsIndexed(mylist, itemContent = {index, item ->
                DataItemColumn(item = item)
            })
        })
    }
}

@Composable
fun DataItemRow(item :DataLazy){
    Column (
        modifier = Modifier.fillMaxWidth()
            .padding(5.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Image(painter = painterResource(id = item.imageRes),
            contentDescription = item.name, modifier = Modifier
                .clip(CircleShape)
                .size(60.dp)
                .scale(1.0f))
        Column (
            modifier = Modifier.fillMaxWidth()
                .padding(5.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(
                text = item.lazyName,
                style = TextStyle(fontSize = 10.sp, fontWeight = FontWeight.Bold)
            )
            Text(
                text = item.name,
                style = TextStyle(fontSize = 10.sp)
            )
        }
    }
}

@Composable
fun DataItemColumn(item :DataLazy){
    var context = LocalContext.current
    Row (
        modifier = Modifier.fillMaxWidth()
            .padding(8.dp)
            .clickable {
                Toast.makeText(context,"Clicked ${item.name}",Toast.LENGTH_SHORT).show()
            }
    ){
        Image(painter = painterResource(id = item.imageRes),
            contentDescription = item.name, modifier = Modifier
                .clip(CircleShape)
                .size(60.dp)
                .scale(1.0f))
        Column (
            modifier = Modifier.fillMaxWidth()
                .padding(10.dp),
            horizontalAlignment = Alignment.Start
        ){
            Text(
                text = item.lazyName,
                style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold)
            )
            Text(
                text = item.name,
                style = TextStyle(fontSize = 14.sp)
            )

        }
    }
}
