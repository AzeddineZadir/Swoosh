package com.example.silver_desk.swoosh.Contoler

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.silver_desk.swoosh.Model.Player
import com.example.silver_desk.swoosh.Utilities.EXTRA_LEAGUE
import com.example.silver_desk.swoosh.R
import com.example.silver_desk.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
    var selectedleague =""
    var player = Player ("","")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

    }
    fun onMensClicked (view :View ){
        b_womens.isChecked=false
        b_coed.isChecked=false
        player.league="mens"
    }
    fun onWomensClicked(view: View){
        b_mens.isChecked=false
        b_coed.isChecked=false
        player.league="womens"
    }
    fun onCoEdClicked(view: View){
        b_mens.isChecked=false
        b_womens.isChecked=false
        player.league="CO-Ed"
    }

    fun nextOnclicked (view: View){
        if (player.league !="") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this,"please select a league ",Toast.LENGTH_LONG).show()
        }
    }

}
