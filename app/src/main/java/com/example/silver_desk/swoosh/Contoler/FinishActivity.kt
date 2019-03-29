package com.example.silver_desk.swoosh.Contoler

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.silver_desk.swoosh.Model.Player
import com.example.silver_desk.swoosh.R
import com.example.silver_desk.swoosh.Utilities.EXTRA_LEAGUE
import com.example.silver_desk.swoosh.Utilities.EXTRA_PLAYER
import com.example.silver_desk.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var player =intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        setContentView( R.layout.activity_finish)
        tv_looking.text="Looking for ${player.league} ${player.skill} league near you "

    }
}
