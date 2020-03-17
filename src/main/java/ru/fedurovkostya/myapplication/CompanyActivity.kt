package ru.fedurovkostya.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_company.*

class CompanyActivity : AppCompatActivity() {
    
    lateinit var dbHandler: DBHandler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_company)
        var position = intent.getIntExtra(INTENT_POSITION,-1)
        dbHandler = DBHandler(this)
        val company = dbHandler.getCompanys()[position]
        tv_full_info.text = company.full_info
        iv_logo_company.setImageResource(company.image)
        btn_company_act.setOnClickListener {
            val intent = Intent(this,WebActivity::class.java)
            intent.putExtra(INTENT_URL,company.url)
            startActivity(intent)
        }
    }
}
/*btn_main.setOnClickListener {
    val openURL = Intent(Intent.ACTION_VIEW)
    openURL.data = Uri.parse("https://pxl.leads.su/click/ba501bc1a7b192633c22897f73066ae8")
    startActivity(openURL)
}*/
