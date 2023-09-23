package com.example.tugasweek2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountBox
import androidx.compose.material.icons.rounded.AddCircle
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.DateRange
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugasweek2.ui.theme.TugasWeek2Theme

class Soal3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TugasWeek2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Soal3Main()
                }
            }
        }
    }
}
val Pink40 = Color(0xFFFFDEE9)
@Composable
fun Soal3Main() {
    Column (
        modifier = Modifier.background(color = Pink40)
    ){
        Icon(
            Icons.Rounded.ArrowBack,
            contentDescription = "arrow",
            tint = Color.Black,
            modifier = Modifier
                .padding(5.dp)
                .size(30.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.burger),
            contentDescription = "Image Compose",
            modifier = Modifier
                .fillMaxWidth()
                .padding(13.dp)
            )
        Box(
            modifier = Modifier
                .background(
                    color = Color.LightGray,
                    shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp)
                )
                .fillMaxHeight()
                .fillMaxWidth()
        ){
            Column {
            Text(text = "Create New Account",
                modifier = Modifier.padding(110.dp,15.dp),
                fontWeight = FontWeight.Bold
                )
            Box(
                modifier = Modifier
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(topStart = 60.dp, topEnd = 60.dp)
                    )
                    .fillMaxHeight()
                    .fillMaxWidth()
            ) {
                Column {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(130.dp, 10.dp)
                    ) {
                        Icon(
                            Icons.Rounded.AccountBox,
                            contentDescription = null,
                            modifier = Modifier
                                .padding(horizontal = 5.dp)
                                .size(28.dp)
                        )

                        Icon(
                            Icons.Rounded.AddCircle,
                            contentDescription = null,
                            modifier = Modifier
                                .padding(horizontal = 5.dp)
                                .size(28.dp)
                        )

                        Icon(
                            Icons.Rounded.DateRange,
                            contentDescription = null,
                            modifier = Modifier
                                .padding(horizontal = 5.dp)
                                .size(28.dp)
                        )
                    }
                    Text(
                        text = "or use your email account",
                        modifier = Modifier.padding(horizontal = 95.dp), color = Color.LightGray
                    )
                    Text(
                        text = "Name",
                        modifier = Modifier.padding(horizontal = 20.dp, vertical = 15.dp)
                    )

                    Box(
                        modifier = Modifier
                            .padding(horizontal = 20.dp, vertical = 1.dp)
                            .border(
                                width = 1.dp,
                                color = Color.LightGray,
                                shape = RoundedCornerShape(20.dp)
                            )
                            .size(340.dp, 60.dp),
                        contentAlignment = Alignment.CenterStart

                    ) {
                        Text(
                            text = "Ex: Jane Doe",
                            color = Color.LightGray,
                            fontSize = 15.sp,
                            modifier = Modifier.padding(20.dp)
                        )
                    }

                    Text(
                        text = "Email",
                        modifier = Modifier.padding(horizontal = 20.dp, vertical = 13.dp)
                    )
                    Box(
                        modifier = Modifier
                            .padding(horizontal = 20.dp, vertical = 1.dp)
                            .border(
                                width = 1.dp,
                                color = Color.LightGray,
                                shape = RoundedCornerShape(20.dp)
                            )
                            .size(340.dp, 60.dp),
                        contentAlignment = Alignment.CenterStart
                    ) {
                        Text(
                            text = "Ex: Janedoe@example.com",
                            color = Color.LightGray,
                            fontSize = 15.sp,
                            modifier = Modifier.padding(20.dp)
                        )
                    }

                    Text(
                        text = "Password",
                        modifier = Modifier.padding(horizontal = 20.dp, vertical = 13.dp)
                    )
                    Box(
                        modifier = Modifier
                            .padding(horizontal = 20.dp, vertical = 1.dp)
                            .border(
                                width = 1.dp,
                                color = Color.LightGray,
                                shape = RoundedCornerShape(20.dp)
                            )
                            .size(340.dp, 60.dp),
                        contentAlignment = Alignment.CenterStart
                    )
                    {

                        Row {
                            Text(
                                text = "Enter Password",
                                color = Color.LightGray,
                                fontSize = 15.sp,
                                modifier = Modifier.padding(20.dp)
                            )

                            Icon(
                                Icons.Rounded.DateRange,
                                contentDescription = null,
                                modifier = Modifier
                                    .padding(50.dp, 20.dp)
                                    .size(100.dp)
                            )
                        }
                    }
                    Box(
                        modifier = Modifier
                            .padding(horizontal = 140.dp, vertical = 13.dp)
                            .background(
                                color = Color.Red,
                                shape = RoundedCornerShape(20.dp)
                            )
                            .size(110.dp, 35.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Register",
                            color = Color.White
                        )
                    }

                    Text(
                        text = "Already have an account ?",
                        modifier = Modifier.padding(100.dp,1.dp,0.dp,0.dp))
                    Text(
                        text = "Login Here",
                        modifier = Modifier.fillMaxHeight(1f).padding(160.dp,2.dp,0.dp,0.dp),
                        color = Color.Red)
                    
                }
            }
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview4() {
    TugasWeek2Theme {
        Soal3Main()
    }
}