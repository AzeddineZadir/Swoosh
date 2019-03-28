package com.example.silver_desk.swoosh.Contoler

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.silver_desk.swoosh.Utilities.EXTRA_LEAGUE
import com.example.silver_desk.swoosh.R
import com.example.silver_desk.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {
    var league = ""
    var skill = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }
    fun onBallerClick(view: View){
        b_beginner.isChecked=false
        skill="Baller"
    }
    fun onBeginnerClick (view: View){
        b_baller.isChecked=false
        skill="Beginner"
    }
    fun onFinishClick(view :View) {
        if (skill!=""){
        val finishActivity =Intent(this,FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE,league)
            finishActivity.putExtra(EXTRA_SKILL,skill)
        startActivity(finishActivity)
        }else{
            Toast.makeText(this,"please select a skill level ", Toast.LENGTH_LONG).show()

        }
    }
}
