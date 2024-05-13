package com.example.sinau

import android.os.Bundle
import android.provider.ContactsContract.Contacts
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sinau.ui.theme.SinauTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BuilderApp()
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(horizontal = 8.dp)
                .padding(vertical = 160.dp)
        ) {
            Box {
                Image(painter = painterResource(id = R.drawable.logos),
                    contentDescription = "Jetpack",
                    modifier = Modifier
                        .padding(4.dp)
                        .border(2.dp, Color.Blue, CircleShape)
                        .clip(CircleShape)
                        .size(60.dp)
                )
                Icon(imageVector = Icons.Default.CheckCircle,
                    contentDescription = "Check Circle Icon",
                    modifier = Modifier.offset(x = 36.dp, y = 36.dp)
                )
            }
            Column {
                Text(text = "Builder")
                Text(text = "Home")
            }


        }
        }

    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BuilderApp(){
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Home")
                },
                navigationIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Back Icon"
                        )
                    }
                }
            )
        },
        modifier = Modifier
    ){
        Box(
            modifier = Modifier.padding(it)
        ){
            Text(text = "Masih belajar kak, bingung",
                modifier = Modifier.padding(20.dp)
            )
        }
    }
}
