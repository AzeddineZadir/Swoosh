package com.example.silver_desk.swoosh.Contoler

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.silver_desk.swoosh.R
import com.example.silver_desk.swoosh.Utilities.EXTRA_LEAGUE
import com.example.silver_desk.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val skill =intent.getStringExtra(EXTRA_SKILL)
        val league= intent.getStringExtra(EXTRA_LEAGUE)
        setContentView( R.layout.activity_finish)
        tv_looking.text="Looking for $league $skill league near you "

    }
}
