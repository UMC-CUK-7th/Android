package com.example.udemy_practice

import java.util.ArrayList;

data class Album(
    var title : String? = "",
    var singer : String? = "",
    var coverImage : Int? = null,
    var songs:ArrayList<Song>? = null
)