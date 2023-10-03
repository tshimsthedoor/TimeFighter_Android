package com.thedorcode.souci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var score = 0

    private lateinit var gameScoreTextView: TextView
    private lateinit var timeLeftTextView: TextView
    private lateinit var tapMeButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gameScoreTextView = findViewById(R.id.game_score_text_view)
        timeLeftTextView = findViewById(R.id.time_left_text_view)
        tapMeButton = findViewById(R.id.tap_me_button)

        tapMeButton.setOnClickListener {
            incrementScore()
        }
    }

    private fun incrementScore() {
        score++

        val newScore = "Your Score: $score"
        gameScoreTextView.text = newScore

    }
    private fun resetGame() {
// reset game logic
    }
    private fun startGame() {
// start game logic
    }
    private fun endGame() {
// end game logic
    }
}