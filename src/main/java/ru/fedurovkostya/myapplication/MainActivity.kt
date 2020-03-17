package ru.fedurovkostya.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var dbHandler: DBHandler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dbHandler = DBHandler(this)
        rv_main_list.layoutManager = LinearLayoutManager(this)
        rv_main_list.adapter = CompanyAdapter(this,dbHandler.getCompanys())
        btn_main_calculator.setOnClickListener{
            val intent = Intent(this,Calculator::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
    }

    fun politika(view: View) {
        val intent = Intent(this,PolitikaActivity::class.java)
        startActivity(intent)
    }

}
