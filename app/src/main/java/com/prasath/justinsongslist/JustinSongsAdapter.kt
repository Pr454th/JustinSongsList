package com.prasath.justinsongslist

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.prasath.justinsongslist.JustinSongsAdapter.*

class JustinSongsAdapter(val songsList:ArrayList<JustinSongs>,val context: Context,val listener:(JustinSongs)->Unit) :RecyclerView.Adapter<ViewHolder>(){
    class ViewHolder(view: View):RecyclerView.ViewHolder(view) {
         var song_poster:ImageView
         var song_name:TextView
//         var count:TextView
        init{
            song_name=view.findViewById<TextView>(R.id.song_name)
            song_poster=view.findViewById<ImageView>(R.id.song_poster)
//            count=view.findViewById<TextView>(R.id.count)
        }
        fun bindView(song:JustinSongs,listener: (JustinSongs) -> Unit)
        {
            song_name.text=song.song_name
            song_poster.setImageResource(song.song_poster)
            itemView.setOnClickListener{listener(song)}
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(context).inflate(R.layout.itemlayout,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(songsList[position],listener)
//        holder.song_name.text=songsList[position].song_name
//        holder.song_poster.setImageResource(songsList[position].song_poster)
//        val c=songsList[position].count
//        holder.count.text=c.toString()
//        holder.itemView.setOnClickListener{
//            Toast.makeText(context, "You are viewing ${holder.song_name.text}", Toast.LENGTH_SHORT).show()
//        }
    }

    override fun getItemCount(): Int {
        return songsList.size
    }
}