package com.example.scorecounter

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel : ViewModel() {

    val scoreTeamA = MutableLiveData<Int>()
    val scoreTeamB = MutableLiveData<Int>()

    init {
        scoreTeamA.value = 0
        scoreTeamB.value = 0
    }

    fun addForTeamA(points: Int) {
        scoreTeamA.value = (scoreTeamA.value)?.plus(points)
    }

    fun addForTeamB(points: Int) {
        scoreTeamB.value = (scoreTeamB.value)?.plus(points)
    }

    fun resetScores() {
        scoreTeamA.value = 0
        scoreTeamB.value = 0
    }
}