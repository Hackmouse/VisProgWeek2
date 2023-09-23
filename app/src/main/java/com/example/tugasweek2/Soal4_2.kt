package com.example.tugasweek2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountBox
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.Create
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugasweek2.ui.theme.TugasWeek2Theme

class Soal4_2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TugasWeek2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Soal5Main()
                }
            }
        }
    }
}

@Composable
fun Soal5Main() {
    Box(modifier = Modifier
        .background(color = Color(0xFF3F48CC))){
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.padding(30.dp, 20.dp, 30.dp, 20.dp)
                ) {

                    Icon(
                        Icons.Rounded.ArrowBack,
                        contentDescription = null,
                        modifier = Modifier.size(width = 40.dp, height = 40.dp),
                        tint = Color.White

                    )

                    Text(
                        modifier = Modifier.weight(1f),
                        text = "Profile",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )

                    Icon(
                        Icons.Rounded.Create,
                        contentDescription = null,
                        modifier = Modifier.size(width = 40.dp, height = 40.dp),
                        tint = Color.White
                    )
                }

                Box {
                    Column (modifier = Modifier
                        .padding(10.dp,10.dp)
                    ){
                        Box {
                            Text(
                                text = "Jerry Tri Tjahyono",
                                modifier = Modifier.padding(30.dp, 55.dp, 0.dp, 0.dp),
                                color = Color.White,
                                fontWeight = FontWeight.Bold,
                                fontSize = 20.sp
                            )
                            Text(
                                text = "Universitas Ciputra",
                                modifier = Modifier.padding(30.dp, 80.dp, 0.dp, 0.dp),
                                color = Color.White
                            )
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(0.dp, 20.dp),
                                horizontalArrangement = Arrangement.Center
                            )
                            {
                                Box(
                                    modifier = Modifier
                                        .padding(190.dp, 10.dp, 0.dp, 0.dp)
                                        .size(110.dp)
                                        .clip(shape = CircleShape)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.burger1),
                                        contentDescription = "Image Compose",
                                        modifier = Modifier
                                            .size(300.dp, 300.dp)
                                            .fillMaxSize()
                                    )
                                }
                            }
                    }
                }
            }
            Column {
                Spacer(modifier = Modifier.height(30.dp))
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(color = Color.LightGray)
            )
        }
        Box(
            modifier = Modifier
                .padding(30.dp, 245.dp)
                .background(color = Color.White, shape = RoundedCornerShape(12.dp))
                .fillMaxWidth()
        ) {
            Row {
                Text(
                    text = "Personal Data",
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(30.dp, 10.dp),
                    fontWeight = FontWeight.Bold
                )

                Column {
                    Divider(
                        color = Color.Gray,
                        thickness = 1.dp,
                        modifier = Modifier
                            .padding(30.dp, 40.dp)
                    )
                    Text(
                        text = "Date of birth",
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                    Text(
                        text = "2 november 2003",
                        modifier = Modifier.padding(0.dp, 5.dp),
                        fontSize = 12.sp
                    )
                    Text(
                        text = "Marital Status",
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                    Text(
                        text = "have girlfriend",
                        fontSize = 12.sp
                    )
                }
            }
            Column(modifier = Modifier.padding(start = 0.dp)) {
                Divider(
                    color = Color.Gray,
                    thickness = 1.dp,
                    modifier = Modifier
                        .padding(30.dp, 40.dp)
                )
                Text(
                    text = "NIS",
                    modifier = Modifier.padding(30.dp, 0.dp),
                    fontSize = 12.sp,
                    color = Color.Gray
                )
                Text(
                    text = "0706012210010",
                    modifier = Modifier.padding(30.dp, 5.dp),
                    fontSize = 12.sp
                )
                Text(
                    text = "Occupation",
                    modifier = Modifier.padding(30.dp, 0.dp),
                    fontSize = 12.sp,
                    color = Color.Gray
                )
                Text(
                    text = "Mahasiswi",
                    modifier = Modifier.padding(30.dp, 0.dp),
                    fontSize = 12.sp
                )
                Text(
                    text = "Email",
                    modifier = Modifier.padding(30.dp, 5.dp),
                    fontSize = 12.sp,
                    color = Color.Gray
                )
                Text(
                    text = "jerryantoni2003@gmail.com",
                    modifier = Modifier.padding(30.dp, 10.dp),
                    fontSize = 12.sp
                )
            }

        }
    }
    Box(
        modifier = Modifier
            .fillMaxWidth(1f)
            .padding(30.dp, 475.dp, 30.dp, 160.dp)
            .background(color = Color.White, shape = RoundedCornerShape(10.dp))
    ) {
        Text(
            text = "Expertise",
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(30.dp, 10.dp),
            fontWeight = FontWeight.Bold
        )
        Divider(
            color = Color.Gray,
            thickness = 1.dp,
            modifier = Modifier
                .padding(30.dp, 40.dp)
        )
        Column {
            Row {
                Icon(Icons.Rounded.AccountBox,
                    contentDescription = null,
                    modifier = Modifier
                        .padding(30.dp, 50.dp)
                        .size(width = 50.dp, height = 50.dp))
            }
        }
        Row {
            Text(text = "Android Development",
                modifier = Modifier.padding(80.dp,60.dp))

        }
    }
    Row {
        Box(
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(30.dp, 640.dp, 30.dp, 15.dp)
                .background(color = Color.White, shape = RoundedCornerShape(10.dp))
        ){
            Text(text = "Send A Massage",
                Modifier.padding(30.dp,10.dp))
            Box(modifier = Modifier
                    .padding(horizontal = 40.dp, vertical = 40.dp)
                    .border(
                        width = 1.dp,
                        color = Color.LightGray,
                        shape = RoundedCornerShape(20.dp)
                    )
                    .size(360.dp, 60.dp),
                    contentAlignment = Alignment.CenterStart

            ) {
                Text(
                    text = "Write A Message",
                    color = Color.LightGray,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(10.dp),
                    fontWeight = FontWeight.Bold
                )
            }
                Box(
                    modifier = Modifier .padding(130.dp,90.dp,0.dp,0.dp)
                        .background(
                            color = Color.Blue,
                            shape = RoundedCornerShape(20.dp)
                        )
                        .size(60.dp, 25.dp),


                )
                {
                    Text(
                        text = "Send",
                        fontSize = 15.sp,
                        textAlign = TextAlign.Center,
                        color = Color.White,
                        modifier = Modifier.padding(10.dp,1.dp)
                        )
            }

        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview6() {
    TugasWeek2Theme {
        Soal5Main()
    }
}