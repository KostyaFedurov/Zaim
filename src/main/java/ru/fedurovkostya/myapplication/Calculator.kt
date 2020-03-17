package ru.fedurovkostya.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_calculator.*
import kotlin.math.pow

class Calculator : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        var text  = et_procent.text.toString()
        if (text.isEmpty()){
            tv_itog_sum.text = sb_sum.progress.toString()
        }else {
            var skobka = (1 + text.toDouble()/100).pow(sb_day.progress.toDouble())
            var ans = (sb_sum.progress.toDouble() * skobka).toInt().toString()
            tv_itog_sum.text = ans
        }
        sb_day.setOnSeekBarChangeListener(object :SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                tv_day.text = p1.toString()
                var text = et_procent.text.toString()
                if (text.isEmpty()){
                    tv_itog_sum.text = sb_sum.progress.toString()
                }else {
                    var skobka = (1 + text.toDouble()/100).pow(p1.toDouble())
                    var ans = (sb_sum.progress.toDouble() * skobka).toInt().toString()
                    tv_itog_sum.text = ans
                }
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }
        })
        sb_sum.setOnSeekBarChangeListener(object :SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                tv_sum.text = p1.toString()
                var text = et_procent.text.toString()
                if (text.isEmpty()){
                    tv_itog_sum.text = p1.toString()
                }else {
                    var skobka = (1 + text.toDouble()/100).pow(sb_day.progress.toDouble())
                    var ans = (p1.toDouble() * skobka).toInt().toString()
                    tv_itog_sum.text = ans
                }
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }
        })
        et_procent.addTextChangedListener(object :TextWatcher{
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                var text  = p0.toString()
                if (text.isEmpty()){
                    tv_itog_sum.text = sb_sum.progress.toString()
                }
                else{
                    var skobka = (1 + text.toDouble()/100).pow(sb_day.progress.toDouble())
                    var ans = (sb_sum.progress.toDouble() * skobka).toInt().toString()
                    tv_itog_sum.text = ans
                }
            }
        })
    }
}
