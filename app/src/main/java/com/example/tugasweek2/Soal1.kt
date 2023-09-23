package com.example.tugasweek2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugasweek2.ui.theme.TugasWeek2Theme

class Soal1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TugasWeek2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SoalMain()
                }
            }
        }
    }
}

@Composable
fun SoalMain() {
    Column (
        modifier = Modifier.fillMaxSize().background(color = Color(0xFFE0E0E0)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ){
        Row (
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Icon(
                Icons.Rounded.ArrowBack,
                contentDescription = null,
                modifier = Modifier.size(width = 40.dp, height = 40.dp)

            )
            Text(
                modifier = Modifier.weight(1f),
                text ="Krabby Patty",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                textAlign = TextAlign.Center
            )
            Icon(
                Icons.Rounded.Menu,
                contentDescription = null,
                modifier = Modifier.size(width = 40.dp, height = 40.dp)
            )
        }
        Row {
            Image(
                painter = painterResource(id = R.drawable.burger),
                contentDescription = "Image Compose",
                modifier = Modifier.size(width = 350.dp, height = 350.dp)
            )
        }
        Column (
            modifier = Modifier.fillMaxSize().background(color = Color(0xFF1C2841),shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)).size(1100.dp)
        ){
            Row  {
                Text(
                    text ="King Box Chessy Beef Burger",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    modifier = Modifier.padding(15.dp)
                )
            }
            Row (modifier = Modifier.padding(horizontal = 10.dp, vertical = 1.dp))
            {
                Icon(
                    Icons.Rounded.Star,
                    contentDescription = null,
                    modifier = Modifier.size(25.dp),
                    tint = Color.Yellow,


                )
                Text(
                    text = " 5.0 ",
                    fontSize = 16.sp,
                    color = Color.White,
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
                Text(
                    text = " (684 Riviews) ",
                    fontSize = 15.sp,
                    color = Color.Gray,
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
            }
            Row {
                Text(
                    text = " Cheesy Beef Burger + 1 pc Ayam \n Crispy + Nasi + Coke Reguler + \n Spider - Verse Toys : Brooklyn Sky \n Scrapper + Super Float Coke ",
                    fontSize = 20.sp,
                    color = Color.White,
                    modifier = Modifier.padding(15.dp)
                )
            }
            Row {
                Text(
                    text = "Read More ...",
                    color = Color.White,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(17.dp,0.dp),
                    textDecoration = TextDecoration.Underline,
                )
            }
            Row  (modifier = Modifier.padding(15.dp,40.dp)){
                Text(
                    text = "Rp. 40,909",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 20.sp,
                    color = Color.White,
                    modifier = Modifier.padding(15.dp),
                )

                Spacer(modifier = Modifier.width(60.dp))
                Card(
                    modifier = Modifier.background(Color.White, shape = RoundedCornerShape(40.dp))
                    ){
                            Text(
                                text = "Add to Chart",
                                color = Color.Black,
                                fontSize = 20.sp,
                                modifier = Modifier.padding(15.dp),
                                fontWeight = FontWeight.Bold,
                            )
                    }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview2() {
    TugasWeek2Theme {
        SoalMain()
    }
}