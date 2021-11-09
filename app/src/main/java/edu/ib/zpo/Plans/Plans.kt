package edu.ib.zpo.Plans

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import edu.ib.zpo.R

class Plans : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.plans)

        val intent = intent
        val date = intent.getStringExtra("date")
    }


}