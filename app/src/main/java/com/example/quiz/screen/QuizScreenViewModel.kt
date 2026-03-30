package com.example.quiz.screen

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class QuizScreenViewModel: ViewModel(){

    private val _pergunta = MutableLiveData<String>()
    val pergunta: LiveData<String> = _pergunta

    fun onPerguntaChanged (novaPergunta: String){
        _pergunta.value = novaPergunta
    }

    private val _resposta = MutableLiveData<Int>()
    val resposta: LiveData<Int> = _resposta

    fun onRespostaChanged (novaResposta: Int){
        _resposta.value = novaResposta
    }

}