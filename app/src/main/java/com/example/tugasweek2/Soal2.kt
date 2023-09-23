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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.Menu
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugasweek2.ui.theme.TugasWeek2Theme


class Soal2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TugasWeek2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Soal2Main()
                }
            }
        }
    }
}

@Composable
fun Soal2Main() {
    Column(
        modifier = Modifier
            .padding(10.dp, 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(horizontalArrangement = Arrangement.SpaceBetween) {
            Icon(
                Icons.Rounded.ArrowBack,
                contentDescription = null,
                modifier = Modifier.size(width = 25.dp, height = 25.dp)
            )
            Text(
                text = "Your Cart",
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Icon(
                Icons.Rounded.Menu,
                contentDescription = null,
                modifier = Modifier.size(width = 25.dp, height = 25.dp)
            )
        }
        Column {
            Row {
                Image(
                    painter = painterResource(id = R.drawable.burger1),
                    contentDescription = "Image Compose",
                    modifier = Modifier
                        .padding(15.dp, 30.dp, 15.dp, 10.dp)
                        .size(width = 140.dp, height = 140.dp)
                        .clip(
                            shape = RoundedCornerShape(
                                topStart = 20.dp,
                                topEnd = 20.dp,
                                bottomEnd = 20.dp,
                                bottomStart = 20.dp
                            )
                        ),
                    contentScale = ContentScale.Crop
                )
                Column(modifier = Modifier.padding(0.dp, 40.dp, 0.dp, 10.dp)) {
                    Row {
                        Text(text = "Krabby Patty")
                    }
                    Row {
                        Text(text = "Plant Based Whopper",
                            fontWeight = FontWeight.Bold)
                    }
                    Row {
                        Text(text = "Rate-\uD83D\uDC68\u200D\uD83C\uDF73 Spicy Level-5/10")
                    }
                    Row {
                        Text(text = "Rp. 12.000")
                    }
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "+",
                            fontSize = 16.sp,
                            modifier = Modifier.padding(horizontal = 5.dp)
                        )
                        Text(
                            text = "8",
                            fontSize = 16.sp,
                            modifier = Modifier.padding(horizontal = 5.dp)
                        )
                        Text(
                            text = "-",
                            fontSize = 20.sp,
                            modifier = Modifier.padding(horizontal = 5.dp)
                        )
                        Row {
                            Icon(
                                imageVector = Icons.Rounded.Close,
                                contentDescription = null,
                                modifier = Modifier.padding(horizontal = 67.dp)
                            )
                        }
                    }
                }
            }
        }
        Column(modifier = Modifier.fillMaxWidth())
        {
            Spacer(modifier = Modifier.height(0.dp))
            Divider(
                color = Color.Gray,
                thickness = 1.dp,
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .align(Alignment.CenterHorizontally)
            )
        }
        Column {
            Row {
                Image(
                    painter = painterResource(id = R.drawable.burger2),
                    contentDescription = "Image Compose",
                    modifier = Modifier
                        .padding(15.dp, 10.dp, 15.dp, 10.dp)
                        .size(width = 140.dp, height = 140.dp)
                        .clip(
                            shape = RoundedCornerShape(
                                topStart = 20.dp,
                                topEnd = 20.dp,
                                bottomEnd = 20.dp,
                                bottomStart = 20.dp
                            )
                        ),
                    contentScale = ContentScale.Crop
                )
                Column(modifier = Modifier.padding(0.dp, 25.dp, 0.dp, 10.dp)) {
                    Row {
                        Text(text = "Krabby Patty")
                    }
                    Row {
                        Text(text = "Extra Spicy Chicken Burger",
                            fontWeight = FontWeight.Bold)
                    }
                    Row {
                        Text(text = "Rate-\uD83C\uDF36 ️ Spicy Level-10/10")
                    }
                    Row {
                        Text(text = "Rp. 36.000")
                    }
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "+",
                            fontSize = 16.sp,
                            modifier = Modifier.padding(horizontal = 5.dp)
                        )
                        Text(
                            text = "5", // Ganti dengan angka yang sesuai
                            fontSize = 16.sp,
                            modifier = Modifier.padding(horizontal = 5.dp)
                        )
                        Text(
                            text = "-",
                            fontSize = 20.sp,
                            modifier = Modifier.padding(horizontal = 5.dp)
                        )
                        Row {
                            Icon(
                                imageVector = Icons.Rounded.Close,
                                contentDescription = null,
                                modifier = Modifier.padding(horizontal = 67.dp)
                            )
                        }
                    }
                }
            }
        }
        Column(modifier = Modifier.fillMaxWidth()) {
            Spacer(modifier = Modifier.height(0.dp))
            Divider(
                color = Color.Gray,
                thickness = 1.dp,
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .align(Alignment.CenterHorizontally)
            )
        }
        Column {
            Row {
                Image(
                    painter = painterResource(id = R.drawable.burger3),
                    contentDescription = "Image Compose",
                    modifier = Modifier
                        .padding(15.dp, 10.dp, 15.dp, 10.dp)
                        .size(width = 140.dp, height = 140.dp)
                        .clip(
                            shape = RoundedCornerShape(
                                topStart = 20.dp,
                                topEnd = 20.dp,
                                bottomEnd = 20.dp,
                                bottomStart = 20.dp
                            )
                        ),
                    contentScale = ContentScale.FillBounds
                )
                Column(modifier = Modifier.padding(0.dp, 25.dp, 0.dp, 10.dp)) {
                    Row {
                        Text(text = "Krabby Patty")
                    }
                    Row {
                        Text(text = "BBQ Beef Rasher",
                            fontWeight = FontWeight.Bold)
                    }
                    Row {
                        Text(text = "Rate-\uD83D\uDC4D Spicy Level-7/10")
                    }
                    Row {
                        Text(text = "Rp. 30.000")
                    }
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "+",
                            fontSize = 16.sp,
                            modifier = Modifier.padding(horizontal = 5.dp)
                        )
                        Text(
                            text = "2", // Ganti dengan angka yang sesuai
                            fontSize = 16.sp,
                            modifier = Modifier.padding(horizontal = 5.dp)
                        )
                        Text(
                            text = "-",
                            fontSize = 20.sp,
                            modifier = Modifier.padding(horizontal = 5.dp)
                        )
                        Row {
                            Icon(
                                imageVector = Icons.Rounded.Close,
                                contentDescription = null,
                                modifier = Modifier.padding(horizontal = 67.dp)
                            )
                        }
                    }
                }
            }
        }
        Column(modifier = Modifier.fillMaxWidth()) {
            Spacer(modifier = Modifier.height(0.dp))
            Divider(
                color = Color.Gray,
                thickness = 1.dp,
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .align(Alignment.CenterHorizontally)
            )
        }
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(18.dp, 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically

            ) {
                Text(
                    text = "Delivery Charges",
                )
                Text(
                    text = "Free Delivery",

                    textDecoration = TextDecoration.Underline
                )
            }
        }
        Column(modifier = Modifier.fillMaxWidth()) {
            Spacer(modifier = Modifier.height(0.dp))
            Divider(
                color = Color.Gray,
                thickness = 1.dp,
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .align(Alignment.CenterHorizontally)
            )
        }
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(18.dp, 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically

            ) {
                Text(
                    text = "Total Amount",
                )
                Text(
                    text = "Rp. 78.000"
                )
            }
        }
        Column(modifier = Modifier.fillMaxWidth()) {
            Spacer(modifier = Modifier.height(0.dp))
            Divider(
                color = Color.Gray,
                thickness = 1.dp,
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .align(Alignment.CenterHorizontally)
            )
        } 
        Row {
            Row (modifier = Modifier
                .fillMaxWidth()
                .padding(18.dp, 30.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically )
            {
               Box(modifier = Modifier
                   .border(width = 1.dp, color = Color.Black, shape = RoundedCornerShape(10.dp))
                   .padding(30.dp,10.dp)
               ){
                   Text(text = "Rp. 78.000" ,
                       fontSize = 15.sp)

               }
                Box(modifier = Modifier
                    .background(color = Color(0xFF1C2841), shape = RoundedCornerShape(10.dp))
                    .padding(60.dp,10.dp)
                )
                {
                    Text(text = "Continue",
                        fontSize = 15.sp,
                        color = Color.White)
                }

            }

        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview3() {
    TugasWeek2Theme {
        Soal2Main()
    }
}