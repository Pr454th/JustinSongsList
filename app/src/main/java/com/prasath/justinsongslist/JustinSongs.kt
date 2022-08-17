package com.prasath.justinsongslist

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class JustinSongs(
    val song_poster:Int,
    val song_name:String?,
//    val count:Int
    ):Parcelable