package com.example.quiz.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun AlternativaQuestion(
    question: String,
    alternativaSelecionada: () -> Unit,
    corAlternativa: Color = ButtonDefaults.buttonColors().contentColor
) {
    OutlinedButton(
        onClick = {alternativaSelecionada},
        colors = ButtonDefaults.buttonColors(
            contentColor = corAlternativa
        ),
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            text = (question)
        )
    }
}