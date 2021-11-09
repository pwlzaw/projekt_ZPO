package edu.ib.zpo.Today

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import edu.ib.zpo.R

class Today : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.today)
    }

    fun onClick(view: View) {
        val intent = Intent(this, NextEx::class.java)
        this.startActivity(intent)
    }
}