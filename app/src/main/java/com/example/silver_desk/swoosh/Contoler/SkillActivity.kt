package com.example.silver_desk.swoosh.Contoler

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.silver_desk.swoosh.Model.Player
import com.example.silver_desk.swoosh.Utilities.EXTRA_LEAGUE
import com.example.silver_desk.swoosh.R
import com.example.silver_desk.swoosh.Utilities.EXTRA_PLAYER
import com.example.silver_desk.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {
 lateinit var player: Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)

    }
    fun onBallerClick(view: View){
        b_beginner.isChecked=false
        player.skill="Baller"
    }
    fun onBeginnerClick (view: View){
        b_baller.isChecked=false
        player.skill="Beginner"
    }
    fun onFinishClick(view :View) {
        if (player.skill!=""){
        val finishActivity =Intent(this,FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER,player)
        startActivity(finishActivity)
        }else{
            Toast.makeText(this,"please select a skill level ", Toast.LENGTH_LONG).show()

        }
    }
}
