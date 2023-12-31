package com.example.madcamp_week2.api.service

import com.example.madcamp_week2.api.data.karaoke.GetKaraokeListResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface KaraokeService {
    @GET("karaoke/list")
    fun getKaraokeList(
        @Query("radius") radius: Int,
        @Query("x") longitude: String,
        @Query("y") latitude: String
    ):Call<GetKaraokeListResponseBody>
}