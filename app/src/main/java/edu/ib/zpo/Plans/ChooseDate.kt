package edu.ib.zpo.Plans

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import edu.ib.zpo.R

class ChooseDate : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.choose_date)
    }

    fun onClick(view: View) {
        val dateText = findViewById<View>(R.id.date) as EditText
        val date = dateText.text.toString()

        val intent = Intent(this, Plans::class.java)
        intent.putExtra("date", date)
        this.startActivity(intent)
    }
}