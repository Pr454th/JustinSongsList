package com.prasath.justinsongslist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView:RecyclerView
    companion object{
        val SONG="song"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val item=ArrayList<JustinSongs>()
//        var count:Int=1
        item.add(JustinSongs(R.drawable.company,"Company"))
        item.add(JustinSongs(R.drawable.purpose,"Purpose"))
        item.add(JustinSongs(R.drawable.wdym,"What do you mean"))
        item.add(JustinSongs(R.drawable.sorry,"Sorry"))
        item.add(JustinSongs(R.drawable.thefeeling,"The feeling"))
        item.add(JustinSongs(R.drawable.wrun,"Where are U now"))
        item.add(JustinSongs(R.drawable.isu,"I`ll show you"))
        item.add(JustinSongs(R.drawable.boyfriend,"Boyfriend"))
        item.add(JustinSongs(R.drawable.confident,"Confident"))
        recyclerView=findViewById(R.id.recycler_view)
        recyclerView.layoutManager=LinearLayoutManager(applicationContext)
        val adapter=JustinSongsAdapter(item,this){
            val intent= Intent(this,SongDetails::class.java)
            intent.putExtra(SONG,it)
            startActivity(intent)
        }
        recyclerView.adapter=adapter
    }
}