package com.prasath.justinsongslist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.song_details.*

class SongDetails:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.song_details)
        val song=intent.getParcelableExtra<JustinSongs>(MainActivity.SONG)
        pposter.setImageResource(song?.song_poster!!)
        pname.text=song.song_name
    }
}