package com.example.checkpoint1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.checkpoint1.ui.theme.Checkpoint1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Checkpoint1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(horizontal = 16.dp)
            ) {

        Image(
            painter = painterResource(id = R.drawable.january),
            contentDescription = null,
            modifier = Modifier
                .size(150.dp)
        )

        Box (
            modifier = Modifier
                .background(
                    Color(0xFFF3F4F5),
                    shape = RoundedCornerShape(20.dp)
                )
                .padding(
                    horizontal = 16.dp,
                    vertical = 30.dp
                )
                ){

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(R.string.title),
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 18.sp
                )

                Text(
                    text = stringResource(R.string.desc),
                    color = Color.Gray,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(top = 8.dp),
                    fontFamily = FontFamily.Serif,
                    fontSize = 14.sp
                )

                Image(
                    painter = painterResource(id = R.drawable.cv_img),
                    contentDescription = "gambar cv",
                    modifier = Modifier
                        .size(200.dp)
                )

                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.width(300.dp),
                ) {
                    Box (
                        modifier = Modifier
                            .border(
                                border = BorderStroke(1.5.dp, Color(0xFF69AAE2)),
                                shape = RoundedCornerShape(8.dp)
                            )
                            .padding(
                                horizontal = 48.dp,
                                vertical = 14.dp
                            )
                    ) {
                        Text(
                            text = "Lewati",
                            fontWeight = FontWeight.SemiBold,
                            color = Color(0xFF69AAE2)
                        )
                    }
                    Box (
                        modifier = Modifier
                            .background(
                                color = Color(0xFF69AAE2),
                                shape = RoundedCornerShape(12.dp)
                            )
                            .padding(horizontal = 48.dp, vertical = 14.dp)
                    ) {
                        Text(
                            text = "Isi CV",
                            fontWeight = FontWeight.SemiBold,
                            color = Color.White
                        )
                    }
                }

            }

        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Checkpoint1Theme {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            Greeting()
        }

    }
}