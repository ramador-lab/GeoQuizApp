package com.bignerdranch.android.geoquiz

import android.util.Log
import androidx.lifecycle.ViewModel

private const val TAG = "QuizViewModel"
class QuizViewModel : ViewModel() {
    //Small Database of the Questions of the entire application

    var currentIndex = 0
    var isCheater = false

    private val questionBank = listOf(
        Question(R.string.question_australia, true),
        Question(R.string.question_oceans, true) ,
        Question(R.string.question_mideast, false),
        Question(R.string.question_africa, false),
        Question(R.string.question_americas, true),
        Question(R.string.question_asia, true),
        Question(R.string.question_worldcup, true),
        Question(R.string.question_worldwarone, false ),
        Question(R.string.question_physics, true ))


        val currentQuestionAnswer: Boolean
            get() = questionBank[currentIndex].answer
        val currentQuestionText: Int
            get() = questionBank[currentIndex].valResId
        fun moveToNext() {
            currentIndex = (currentIndex + 1) % questionBank.size
        }


}