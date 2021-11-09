package edu.ib.zpo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import edu.ib.zpo.Exercises.DatabaseEx
import edu.ib.zpo.Exercises.UsersEx
import edu.ib.zpo.Plans.PlanTemplates
import edu.ib.zpo.Plans.Plans
import edu.ib.zpo.Today.Today

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        val intent = Intent(this, Today::class.java)
        this.startActivity(intent)
    }

    fun onClick3(view: View) {
        val intent = Intent(this, Plans::class.java)
        this.startActivity(intent)
    }

    fun onClick1(view: View) {
        val intent = Intent(this, UsersEx::class.java)
        this.startActivity(intent)
    }

    fun onClick2(view: View) {
        val intent = Intent(this, DatabaseEx::class.java)
        this.startActivity(intent)
    }

    fun onClick4(view: View) {
        val intent = Intent(this, PlanTemplates::class.java)
        this.startActivity(intent)
    }
}