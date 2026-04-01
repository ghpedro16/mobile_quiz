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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.quiz.components.AlternativaQuestion

@Composable
fun QuizScreen(
    modifier: Modifier = Modifier
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

        QuestionCard(
            enunciado = "Qual a capital da França?",
            alternativas = listOf(
                "Itapevi",
                "Paris",
                "Londres",
                "Madri"
            ),
            alternativaCorreta = "Paris"
        )

    }
}

@Composable
fun QuestionCard(
    enunciado: String,
    alternativas: List<String>,
    alternativaCorreta: String
) {

    var alternativaSelecionada by remember {
        mutableStateOf("")
    }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = (enunciado))

            alternativas.forEach {
                if (alternativaSelecionada != ""){
                    AlternativaQuestion(
                        question = it,
                        alternativaSelecionada = {alternativaSelecionada = it}
                    )
                }else{
                    val corAlternativa = if (alternativaCorreta == it){
                        Color.Green
                    }else{
                        Color.Red
                    }
                    AlternativaQuestion(
                        question = it,
                        alternativaSelecionada = {alternativaSelecionada = it},
                        corAlternativa = corAlternativa
                    )
                }
            }
        }
    }
}

