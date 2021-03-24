package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val username=intent.getStringExtra(Constants.USER_NAME)
        tv_name.text=username
        val totalQuestions=intent.getStringExtra(Constants.TOTAL_QUESTIONS)
        val correctAnswer=intent.getStringExtra(Constants.CORRECT_ANSWER)
        tv_score.text="Your score is $correctAnswer out of $totalQuestions"
        btn_finish.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

    }
}