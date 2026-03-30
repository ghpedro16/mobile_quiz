package com.example.quiz.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.quiz.components.CardPerguntas

@Composable
fun QuizScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    QuizScreenViewModel: QuizScreenViewModel
) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(217, 71, 204, 255)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Row() {
            Image(
                painter = painterResource(com.example.quiz.R.drawable.quiz),
                contentDescription = "Icon QUIZ",
                modifier = Modifier
                    .size(80.dp)
            )
        }

        OutlinedButton(
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                Color.Green,
                contentColor = Color.Black
            ),
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp)
        ) {
            Text(
                text = "Pergunta 1 de 3",
                fontSize = 20.sp
            )
        }

    }
}