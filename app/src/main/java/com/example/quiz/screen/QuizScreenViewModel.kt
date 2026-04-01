package com.example.quiz.screen

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class QuizScreenViewModel: ViewModel(){

    private val _acertos = MutableLiveData<Int>()
    val acertos: LiveData<Int> = _acertos

    fun onPerguntaChanged (){

    }

}