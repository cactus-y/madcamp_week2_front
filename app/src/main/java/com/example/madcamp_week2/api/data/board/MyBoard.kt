package com.example.madcamp_week2.api.data.board

import com.example.madcamp_week2.api.data.karaoke.Karaoke
import com.example.madcamp_week2.api.data.user.User
import com.google.gson.annotations.SerializedName

data class MyBoard(
    @SerializedName("id")
    val boardObjectId: String,
    @SerializedName("deadline")
    val deadLine: String,
    @SerializedName("content")
    val comment: String,
    @SerializedName("karaoke")
    val karaoke: Karaoke,
    @SerializedName("guestList")
    val guestList: List<User>
)
