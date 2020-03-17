package ru.fedurovkostya.myapplication

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class CompanyAdapter(val activity: MainActivity, var list:MutableList<Company>): RecyclerView.Adapter<CompanyAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(activity).inflate(
                R.layout.main_list_item,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Glide.with(activity).load(list[position].image).into(holder.iv_logo)
        //holder.iv_logo.setImageResource(list[position].image)
        holder.tv_short_descrip.text = list[position].short_info
        holder.tv_act.setOnClickListener {
            val intent = Intent(activity,CompanyActivity::class.java)
            intent.putExtra(INTENT_POSITION,position)
            activity.startActivity(intent)
        }
    }


    class ViewHolder(v: View): RecyclerView.ViewHolder(v){
        var iv_logo = v.findViewById<ImageView>(R.id.iv_logo)
        var tv_short_descrip = v.findViewById<TextView>(R.id.tv_short_descrip)
        var tv_act = v.findViewById<TextView>(R.id.tv_act)
    }

}