package com.example.quiz.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.quiz.R

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color(28, 167, 189, 255)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Row() {
            Image(
            painter = painterResource(R.drawable.quiz),
            contentDescription = "Icon QUIZ",
            modifier = Modifier
                .size(120.dp)
            )
        }

        Spacer(modifier = Modifier.padding(16.dp))

        Row() {
            Text(
                text = "QUIZATRON 3000",
                color = Color.Black,
                fontSize = 24.sp
            )
        }

        Spacer(modifier = Modifier.padding(16.dp))

        Row() {
            OutlinedButton(
                onClick = {navController.navigate("quiz")},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Yellow,
                    contentColor = Color.Black
                )
            ) {
                Text(
                    text = "COMECAR!",
                    fontSize = 20.sp
                )
            }
        }

    }
}