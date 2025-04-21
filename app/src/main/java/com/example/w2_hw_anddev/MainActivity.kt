package com.example.w2_hw_anddev

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.*
import androidx.compose.ui.tooling.preview.Preview
import com.example.w2_hw_anddev.ui.theme.W2HWAndDevTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            W2HWAndDevTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    content = { innerPadding ->
                        ArtSpaceApp(modifier = Modifier.padding(innerPadding))
                    }
                )
            }
        }
    }

    @Composable
    fun ArtSpaceApp(modifier: Modifier = Modifier) {
        Surface(
            modifier = modifier
                .fillMaxSize()
                .padding(16.dp),
            color = MaterialTheme.colorScheme.background
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top,
                modifier = Modifier.fillMaxSize()
            ) {
                Image(
                    painter = painterResource(R.drawable.starrynight),
                    contentDescription = " Art image",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(300.dp)
                        .border(1.dp, MaterialTheme.colorScheme.primary)
                )

                Spacer(modifier = Modifier.height(16.dp))

                Surface(
                    shadowElevation = 4.dp,
                    border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary),
                    modifier = Modifier
                        .wrapContentSize()
                        .padding(horizontal = 16.dp, vertical = 8.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Text(
                            text = "Starry Night",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = " Vincent Van Goth",
                            fontSize = 24.sp
                        )
                        Text(
                            text = "1889",
                            fontSize = 24.sp
                        )
                    }
                }
                Spacer(modifier = Modifier.height(24.dp))

                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Button(onClick = { }) {
                        Text(" Previous")
                    }
                    Button(onClick = { }) {
                        Text("Next")
                    }
                }
            }
        }
    }


@Preview(showBackground = true)
@Composable
fun ArtSpacePreview() {
    W2HWAndDevTheme {
    ArtSpaceApp()
        }
    }
}